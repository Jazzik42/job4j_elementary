package ru.job4j.converter
;
public class Converter {

    public static double rubleToEuro(int value) {
        double rsl = value / 70.0;
        return rsl;
    }

    public static double rubleToDollar(int value) {
        double rsl = value/60.0; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        double dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}