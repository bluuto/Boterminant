package com.github.bluuto;

public class Matrix {
    // An array within an array
    int[][] matrix;
    int size;

    public Matrix(int size) {
        // Creates a matrix with an equal number
        // of rows and columns
        this.matrix = new int[size][size];
        this.size = size;
    }

    public int getElement(int row, int column) {
        return matrix[row][column];
    }

    public void setElement(int row, int column, int value) {
        matrix[row][column] = value;
    }
}
