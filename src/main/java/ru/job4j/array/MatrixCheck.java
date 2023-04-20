package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                return false;
            }
        }
        return true;
    }
}
