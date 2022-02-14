package com.epam.jwd.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {


    public int readIntValue(int value) {
        return value;
    }

    public double inputDoubleByScanner(String msg) {
        double result;
        @SuppressWarnings("recource")
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        try {
            result = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("try to insert double pls");
            result = 1;
        }
        return result;
    }
}
