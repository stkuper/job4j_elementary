package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDevide(double first, double second) {
        return subtract(first, second)
                + devide(first, second);
    }

    public static double sumAndMultiplyAndSubtractAndDevide(double first, double second) {
        return sumAndMultiply(first, second)
                + subtractAndDevide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчёта равен: " + subtractAndDevide(10, 20));
        System.out.println("Результат расчёта равен: " + sumAndMultiplyAndSubtractAndDevide(10, 20));
    }

}
