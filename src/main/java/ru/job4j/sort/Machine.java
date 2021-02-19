package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int a = money - price;
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            while ((a - coins[i]) >= 0) {
                a = a - coins[i];
                rsl[count] = coins[i];
                count++;
            }

            }

        int size = count;
        return Arrays.copyOf(rsl, size);
    }
}