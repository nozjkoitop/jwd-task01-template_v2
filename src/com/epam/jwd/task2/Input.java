package com.epam.jwd.task2;

import java.util.Scanner;

public class Input {
    @SuppressWarnings("recource")
    Scanner scanner = new Scanner(System.in);


    public int inputIntByScanner(String msg) {
        int intResult;
        System.out.println(msg);
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        intResult = scanner.nextInt();
        return intResult;
    }

    public double inputDoubleByScanner(String msg) {
        double doubleResult;
        System.out.println(msg);
        while (!scanner.hasNextDouble()) {
            scanner.next();
        }
        doubleResult = scanner.nextDouble();
        return doubleResult;
    }
}
