package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140f;
        float expected = 2f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result " + passed);
        float inDollar = 150f;
        float expectedDollar = 2.5f;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("150 rubles are 2.5. Test result " + passedDollar);
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = rubleToDollar(150);
        System.out.println("150 rubles are " + dollar + " dollar.");
    }
}
