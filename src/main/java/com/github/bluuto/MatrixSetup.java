package com.github.bluuto;

import java.util.Scanner;

public class MatrixSetup {
    private final Scanner keyboard;
    private final Matrix m;

    public MatrixSetup (Scanner keyboard, Matrix m) {
        this.keyboard = keyboard;
        this.m = m;
    }

    public Matrix run() {
        // Outer loop for each columb
        for(int i=0;i < m.size; ++i) {
            // Inner loop for each column
            for(int j=0;j < m.size; ++j) {
                System.out.println("Row by row, enter each element's value, starting with a11.");
                int v = keyboard.nextInt();

                // Set the current element equal to whichever
                // value the user enters
                m.setElement(i, j, v);
            }
        }
        return m;
    }
}
