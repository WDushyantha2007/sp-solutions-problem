package org.example;

import java.util.ArrayList;
import java.util.List;

public class SecondProblem {

    public List<Object> combineTwoLists(List<Object> first, List<Object> second) {

        if (first == null || first.isEmpty()) {
            return second;
        }

        if (second == null || second.isEmpty()) {
            return first;
        }

        if ((first == null || first.isEmpty()) &&
                (second == null || second.isEmpty())) {

            return new ArrayList<>();

        }

        List<Object> result = new ArrayList<>();
        int maxLength = Math.max(first.size(), second.size());
        for (int index = 0; index < maxLength; index++) {
            if (index < first.size()) {
                result.add(first.get(index));
            }
            if (index < second.size()) {
                result.add(second.get(index));
            }
        }
        return result;
    }
}
