package ru.job4j.converter
;
public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        int expected1 = 2;
        int expected2 = 2;
        boolean passed1 = expected1 == euro;
        boolean passed2 = expected2 == dollar;
        System.out.println("140 rubles are 2 euro. Test result1 : " + passed1);
        System.out.println("140 rubles are 2 dollar. Test result2 : " + passed2);
    }
}