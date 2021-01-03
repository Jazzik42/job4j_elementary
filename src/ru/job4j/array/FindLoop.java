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

    public static int indexOf(int[] data, int el, int start, int finish) {
        int a = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                a = i;
                break;
            }
        }
        return a;
    }
}
