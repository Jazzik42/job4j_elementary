package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] massiv = new int[bound];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = i * i;
            }
        return massiv;

    }

    public static void main(String[] args) {
     int[] massiv = calculate(4);
        for (int numbers : massiv) {
            System.out.println(numbers);
        }

    }
}
