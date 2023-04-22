package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        for (int value : coins) {
            price = value;
            while (money >= price) {
                money -= price;
                rsl[size] = price;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
