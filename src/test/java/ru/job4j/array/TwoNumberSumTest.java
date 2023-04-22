package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoNumberSumTest {
    @Test
    public void whenTwoEqualsNumbersYesTarget() {
        int[] array = {5, 5};
        int target = 10;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {0, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTwoEqualsNumbersNotTarget() {
        int[] array = {5, 5};
        int target = 12;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenWithNegativeNumbersYesTarget() {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = 3;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenWithoutNegativeNumbersYesTarget() {
        int[] array = {0, 2, 5, 8, 10, 12};
        int target = 15;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {2, 4};
        assertThat(result).containsExactly(expected);
    }
}