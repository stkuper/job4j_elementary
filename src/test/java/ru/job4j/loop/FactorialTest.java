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
    public void whenCalculateFactorialForTenThenThreeMillionSixHundredTwentyEightThousandEightHundred() {
        int n = 10;
        int expected = 3628800;
        int result = Factorial.calc(n);
        assertThat(result).isEqualTo(expected);
    }
}