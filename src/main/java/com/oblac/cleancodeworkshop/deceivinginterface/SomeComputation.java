package com.oblac.cleancodeworkshop.deceivinginterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Deceiving interface example.
 */
public class SomeComputation {

    public void computeBAD(List<Integer> input, List<Integer> output) {
        for (int item : input) {
            output.add((item - 2) * 2);
        }
    }

    public List<Integer> computeGOOD(Iterable<Integer> input) {
        List<Integer> output = new ArrayList<>();
        for (int item : input) {
            output.add((item - 2) * 2);
        }
        return output;
    }

    public void use() {
        // whaaaat is going on here?
        // what is the input and what is the output?
        computeBAD(listOf(1, 2, 3), listOf(3, 4, 5));

        // not this is better!
        computeGOOD(listOf(1, 2, 3));
    }


    private List<Integer> listOf(int... arr) {
        final List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        return list;
    }
}
