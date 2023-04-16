package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[]{2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = Turn.back(input);
        int[] expected = new int[]{8, 7, 6, 5, 4, 3, 2, 1, 0};
        assertThat(result).containsExactly(expected);
    }
}