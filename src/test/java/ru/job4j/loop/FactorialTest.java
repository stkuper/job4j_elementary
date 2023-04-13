package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int expected = 120;
        int result = Factorial.calc(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int expected = 1;
        int result = Factorial.calc(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenCalculateFactorialForMinusOneThenZero() {
        int n = -1;
        int expected = 0;
        int result = Factorial.calc(n);
        assertThat(result).isEqualTo(expected);
    }
}