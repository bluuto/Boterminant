package com.github.bluuto;

import java.util.Scanner;

public class MainBootstrap {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        new Main(keyboard).run();
    }
}