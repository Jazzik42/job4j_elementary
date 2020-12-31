package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] massiv, int el) {
        int rsl = -1;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == el) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}
