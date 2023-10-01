package com.company;

class Solution {
    private int[] drow = {-1, -1, -1, 0, 0, 1, 1, 1};
    private int[] dcol = {-1, 0, 1, -1, 1, -1, 0, 1};

    public void gameOfLife(int[][] board) {
        int[][] temp = new int[board.length][board[0].length];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                temp[i][j] = helper(i, j, board);
            }
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                board[i][j] = temp[i][j];
            }
        }
    }

    private int helper(int row, int col, int[][] board) {
        int count = 0;
        for (int i = 0; i < drow.length; i++) {
            if ((0 <= row + drow[i] && row + drow[i] <= board.length) && (0 <= col + dcol[i] && col + dcol[i] <= board[0].length) && (board[row + drow[i]][col + dcol[i]] == 1)) {
                count = count + 1;
            }
        }
        if (board[row][col] == 1) {
            if (count < 2) {
                return 0;
            } else if (count == 2 || count == 3) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (count == 3) {
                return 1;
            }
            return 0;
        }
    }
}