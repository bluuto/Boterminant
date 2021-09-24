package com.github.bluuto;

import java.util.Scanner;

public class ThreeByThreeCalculator {
    private final Scanner keyboard;

    public ThreeByThreeCalculator(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    public void run() {
        Matrix m = new Matrix(3);
        calculate(new MatrixSetup(keyboard, m).run());
    }

    public void calculate(Matrix m) {
        int a = m.getElement(0, 0) * m.getElement(1, 1);
        int b = m.getElement(0, 1) * m.getElement(1, 0);

        System.out.printf("The determinant of this matrix is %d", a-b);
    }
}
