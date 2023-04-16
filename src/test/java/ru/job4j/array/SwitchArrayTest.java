package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap4To6() {
        int[] input = {2, 4, 0, 6, 1, 8, 3, 5, 7};
        int sourse = 4;
        int dest = 6;
        int[] result = SwitchArray.swap(input, sourse, dest);
        int[] expected = {2, 4, 0, 6, 3, 8, 1, 5, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwapMediumElement() {
        int[] input = {2, 4, 0, 6, 1, 8, 3, 5, 7};
        int source = input.length / 2;
        int dest = input.length / 2 + 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {2, 4, 0, 6, 8, 1, 3, 5, 7};
        assertThat(result).containsExactly(expected);

    }
}