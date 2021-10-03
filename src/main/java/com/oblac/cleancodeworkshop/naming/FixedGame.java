package com.oblac.cleancodeworkshop.naming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FixedGame {

    private static final int STATUS_VALUE = 0;
    private static final int FLAGGED = 4;

    // also: primitive obsession!
    public List<int[]> getFlaggedCells(int[][] gameBoard) {
        return Arrays
            .stream(gameBoard)
            .filter(cell -> cell[STATUS_VALUE] == FLAGGED)
            .collect(Collectors.toList());
    }

    // this is the same method as above,
    // without primitive obsessions
    public List<Cell> getGameFlaggedCells(Cell[] gameBoard) {
        return Arrays
            .stream(gameBoard)
            .filter(Cell::isFlagged)
            .collect(Collectors.toList());
    }

    private class Cell {
        public boolean isFlagged() {
            return false;
        }
    }
}
