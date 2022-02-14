package com.epam.jwd.task2;

import java.util.Arrays;

public class Output {
    public void showIntValue(String intOutputMsg, int x) {
        System.out.println(intOutputMsg + x);
    }

    public void showDoubleValue(String doubleOutputMsg, double y) {
        System.out.println(doubleOutputMsg + y);
    }

    public void showArrayOfDoubleValues(String arrayOfDoublesOutputMsg, double[] resultArray) {
        System.out.println(arrayOfDoublesOutputMsg + Arrays.toString(resultArray));
    }
}
