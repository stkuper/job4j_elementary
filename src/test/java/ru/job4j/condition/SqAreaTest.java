package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2ThenS2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double result = SqArea.square(p, k);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenP9K3ThenS3dot8() {
        int p = 9;
        double k = 3;
        double expected = 3.8;
        double result = SqArea.square(p, k);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenP4K1dot5ThenS0dot96() {
        int p = 4;
        double k = 1.5;
        double expected = 0.96;
        double result = SqArea.square(p, k);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenP10K2dot5ThenS5dot1() {
        int p = 10;
        double k = 2.5;
        double expected = 5.1;
        double result = SqArea.square(p, k);
        Assert.assertEquals(expected, result, 0.01);
    }
}