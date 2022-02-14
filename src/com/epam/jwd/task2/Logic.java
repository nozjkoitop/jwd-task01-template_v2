package com.epam.jwd.task2;

import java.util.Arrays;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Logic {

    public double task2(double a, double b, double c) {
        double d;
        try {
            d = (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c + pow(b, -2);
        } catch (ArithmeticException e) {
            System.err.println("Sneaky prankster...");
            d = 0;
        }
        return d;
    }

    public double[] task5(double x, double y, double z) {
        double[] arr = {x, y, z};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = pow(arr[i], 2);
            } else if (i < 0) {
                arr[i] = pow(arr[i], 4);
            } else {
                System.err.println("Zero is the bad chose!!!");
            }
        }
        return arr;
    }

    public int task6(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.stream(arr).sorted();
        int sum = arr[0] + arr[arr.length - 1];
        return sum;
    }
}
