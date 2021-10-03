package com.oblac.cleancodeworkshop.naming;

import java.util.ArrayList;
import java.util.List;

// bad, bad, naming

public class Game {

    public List<int[]> getThem(int[][] theList) {
        List<int[]> list1 = new ArrayList<int[]>();
        // gets flagged field from game board
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }

}
