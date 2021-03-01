package ru.job4j.stream;

import java.util.stream.Stream;

public class WarriorOfWarcraft {
    private String nickName;
    private String race;
    private String fraction;
    private String guild;
    private int damage;
    private int healthPoint;
    private int armor;
    private String arms;

    public static class Builder {
        private String nickName;
        private String race;
        private String fraction;
        private String guild;
        private int damage;
        private int healthPoint;
        private int armor;
        private String arms;

        private Builder buildNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        private Builder buildRace(String race) {
            this.race = race;
            return this;
        }

        private Builder buildFraction(String fraction) {
            this.fraction = fraction;
            return this;
        }

        private Builder buildGuild(String guild) {
            this.guild = guild;
            return this;
        }

        private Builder buildDamage(int damage) {
            this.damage = damage;
            return this;
        }

        private Builder buildHealthPoint(int healthPoint) {
            this.healthPoint = healthPoint;
            return this;
        }

        private Builder buildArmor(int armor) {
            this.armor = armor;
            return this;
        }

        private Builder buildArms(String arms) {
            this.arms = arms;
            return this;
        }

        public WarriorOfWarcraft build() {
            WarriorOfWarcraft war = new WarriorOfWarcraft();
            war.nickName = nickName;
            war.race = race;
            war.fraction = fraction;
            war.guild = guild;
            war.damage = damage;
            war.healthPoint = healthPoint;
            war.armor = armor;
            war.arms = arms;
            return war;
        }
    }

    @Override
    public String toString() {
        return "WarriorOfWarcraft{"
                + "nickName='" + nickName + '\''
                + ", race='" + race + '\''
                + ", fraction='" + fraction + '\''
                + ", guild='" + guild + '\''
                + ", damage=" + damage
                + ", healthPoint=" + healthPoint
                + ", armor=" + armor
                + ", arms='" + arms + '\''
                + '}';
    }

    public static void main(String[] args) {
        WarriorOfWarcraft war = new Builder().buildNickName("IWar")
                .buildRace("Orc")
                .buildFraction("Horde")
                .buildGuild("ForHorde")
                .buildHealthPoint(35000)
                .buildDamage(2000)
                .buildArmor(13000)
                .buildArms("Axe")
                .build();
        System.out.println(war);
    }
}
