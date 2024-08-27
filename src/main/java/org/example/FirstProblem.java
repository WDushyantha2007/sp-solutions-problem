package org.example;

import java.util.List;

public class FirstProblem {

    public static int sumInListForLoop(List<Integer> list) {

        int sum = 0;

        if (list == null || list.isEmpty()) {
            return sum;
        }

        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }

        return sum;
    }

    public static int sumWhileLoop(List<Integer> list) {

        int sum = 0;
        int index = 0;

        if (list == null || list.isEmpty()) {
            return sum;
        }

        while (index < list.size()) {
            sum = sum + list.get(index);
            index++;
        }

        return sum;
    }

    public int recursiveSum(int index, int sum, List<Integer> list) {
        if (index == list.size() - 1) {
            return sum;
        } else {
            sum = sum + list.get(index);
            index++;
            return recursiveSum(index, sum, list);
        }
    }

}
