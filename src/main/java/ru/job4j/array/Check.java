package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        for (boolean b : data) {
            if (data[0] == b) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }
}
