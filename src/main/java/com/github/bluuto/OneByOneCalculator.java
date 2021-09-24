package com.github.bluuto;

import java.util.Scanner;

public class OneByOneCalculator {
    private final Scanner keyboard;

    public OneByOneCalculator(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    public void run() {
        System.out.println("Enter a11");
        int a = keyboard.nextInt();

        // The value of a 1x1 matrix is just the value of a11,
        // so no need to create a matrix object here.
        System.out.printf("The determinant of this matrix is %d", a);
    }
}
