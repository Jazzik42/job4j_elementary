package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp;
            if ((array.length - 1 - i) >= i) {
                temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }

       }
        return array;
        }

    public static void main(String[] args) {
        int[] massiv = new int[] {1, 2, 3, 4, 5, 6};
        back(massiv);
        for (int massivi : massiv) {
            System.out.println(massivi);
        }

    }

}
