package com.epam.jwd.task2;

import java.util.Arrays;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Logic {

    public double formulaCalculation(double a, double b, double c) {
        if (a == 0 | b == 0) {
            throw new RuntimeException("Invalid input");
        }
        return (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c + pow(b, -2);
    }

    public double[] nonNegativeSquaredNegativeToFourthPower(double x, double y, double z) {
        double[] arr = {x, y, z};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[i] = pow(arr[i], 2);
            } else if (arr[i] < 0) {
                arr[i] = pow(arr[i], 4);
            }
        }
        return arr;
    }

    public int maxAndMinSum(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return arr[0] + arr[arr.length - 1];
    }
}
