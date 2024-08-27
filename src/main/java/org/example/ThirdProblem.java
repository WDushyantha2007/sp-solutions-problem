package org.example;

public class ThirdProblem {

    public static void Fibonacci() {
        int sequence = 100;
        for (int index = 0; index <= sequence; index++) {
            if (index == 0 || index == 1) {
                System.out.println(index);
            } else {
                int firstValue = index - 1;
                int secondValue = index - 2;
                System.out.println(firstValue + secondValue);
            }
        }
    }

}
