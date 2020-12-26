package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int result = first;
        if (second > first && second > third) {
            result = second;
        }
        if (third > second && third > first) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int max = MultiMax.max(12, 12, 22);
        System.out.println(max);
    }
}
