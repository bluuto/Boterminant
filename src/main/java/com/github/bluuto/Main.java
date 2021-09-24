package com.github.bluuto;

import java.util.Scanner;

public class Main {
    private final Scanner keyboard;

    public Main(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    public void run() {
        System.out.println("For this nxn matrix, what is the value of n?");
        int size = keyboard.nextInt();

        switch (size) {
            case 1 -> new OneByOneCalculator(keyboard).run();
            case 2 -> new TwoByTwoCalculator(keyboard).run();
            case 3 -> new ThreeByThreeCalculator(keyboard).run();
        }

    }

}
