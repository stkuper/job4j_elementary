package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2 + 3;
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
