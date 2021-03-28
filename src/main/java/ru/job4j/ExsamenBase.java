package ru.job4j;

public class ExsamenBase {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int a = 0;
        int b = 0;
        int k = 0;
        while (a < left.length && b < right.length) {
            rsl[k++] = left[a] < right[b] ? left[a++] : right[b++];
        }
        if (a < left.length) {
            System.arraycopy(left, a, rsl, k, left.length - a);
        }
        if (b < right.length) {
            System.arraycopy(right, b, rsl, k, right.length - b);
        }
        return rsl;
    }
}

