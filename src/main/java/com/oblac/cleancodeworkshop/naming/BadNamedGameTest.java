package com.oblac.cleancodeworkshop.naming;

import java.util.List;

public class BadNamedGameTest {
    public void returns_selected_items() {
        int[][] board = new int[][]{
            {1, 5},
            {2, 6},
            {3, 7},
            {4, 8}};

        List<int[]> flagged = new Game().getThem(board);
        // new int[]{4, 8}
    }
}
