package ru.job4j.condition;

public class SwitchWeek {
    public static void main(String[] args) {
        String nameOfDay = nameOfDay(4);
        System.out.println(nameOfDay);
    }

    public static String nameOfDay(int day) {

        String name;
        switch (day) {
            case 1:
            name = "понедельник";
            break;
            case 2:
                name = "вторник";
                break;
            case 3:
                name = "среда";
                break;
            case 4:
                name = "четверг";
                break;
            case 5:
                name = "пятница";
                break;
            case 6:
                name = "суббота";
                break;
            case 7:
                name = "воскресенье";
                break;
            default:
                name = "ошибка";
        }
        return name;
    }
}
