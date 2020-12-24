package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean res = left > right;
        int result = res ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int left = 4;
        int right = 3;
        int max = Max.max(left, right);
        System.out.println(max);
    }
}
