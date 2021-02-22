package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int mid) {
        return max(mid, max(left, right));
    }

    public static int max(int left, int right, int mid, int top) {
        return max(max(left, right), max(mid, top));
    }

    public static void main(String[] args) {
        int left = 4;
        int right = 3;
        int max = Max.max(left, right);
        System.out.println(max);
    }
}
