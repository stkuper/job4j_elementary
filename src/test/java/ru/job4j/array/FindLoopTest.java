package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int el = 10;
        int result = FindLoop.indexOf(intArray, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas8Then8() {
        int[] intArray = new int[]{3, 5, 2, 8, 9, 1, 6, 7, 0, 4};
        int el = 8;
        int result = FindLoop.indexOf(intArray, el);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}