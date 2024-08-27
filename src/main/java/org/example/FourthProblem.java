package org.example;

import java.util.*;

public class FourthProblem {

    public static void formLargestNumber(List<Integer> list) {
        Map treeMap = new TreeMap();
        StringBuffer stringBuffer = new StringBuffer();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            stringBuffer.append(list.get(i));
            int firstDigit = Integer.parseInt(stringBuffer.substring(0, 1));
            treeMap.put(firstDigit, list.get(i));
            stringBuffer.delete(0, stringBuffer.length());
        }


        Set<Map.Entry> entries = treeMap.entrySet();
        Iterator<Map.Entry> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            result.add(0, (Integer) entry.getValue());
        }
    }
}
