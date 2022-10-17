package com.hackerrank.dataStructures;

import java.util.Scanner;

public class P02_Java2DArray {

    private static final int SIZE = 6;

    private static final int[][] matrix = new int[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                maxSum = Math.max(getHourGlassSum(row, col), maxSum);
            }
        }

        System.out.println(maxSum);
    }

    private static int getHourGlassSum(int row, int col) {
        int sum = 0;

        try {
            sum += getFirstElement(row, col);
            sum += getSecondElement(row, col);
            sum += getThirdElement(row, col);
            sum += getFourthElement(row, col);
            sum += getFifthElement(row, col);
            sum += getSixthElement(row, col);
            sum += getSeventhElement(row, col);
        } catch (Exception e) {
            return Integer.MIN_VALUE;
        }

        return sum;
    }

    private static int getFirstElement(int row, int col) {
        row--;
        col--;

        if (isInBounds(row, col)) {
            return matrix[row][col];
        }

        throw new IndexOutOfBoundsException("[Row]: " + row + " or [Col]: " + col + " is out of bounds");
    }

    private static int getSecondElement(int row, int col) {
        row--;

        if (isInBounds(row, col)) {
            return matrix[row][col];
        }

        throw new IndexOutOfBoundsException("[Row]: " + row + " or [Col]: " + col + " is out of bounds");
    }

    private static int getThirdElement(int row, int col) {
        row--;
        col++;

        if (isInBounds(row, col)) {
            return matrix[row][col];
        }

        throw new IndexOutOfBoundsException("[Row]: " + row + " or [Col]: " + col + " is out of bounds");
    }

    private static int getFourthElement(int row, int col) {
        if (isInBounds(row, col)) {
            return matrix[row][col];
        }

        throw new IndexOutOfBoundsException("[Row]: " + row + " or [Col]: " + col + " is out of bounds");
    }

    private static int getFifthElement(int row, int col) {
        row++;
        col--;

        if (isInBounds(row, col)) {
            return matrix[row][col];
        }

        throw new IndexOutOfBoundsException("[Row]: " + row + " or [Col]: " + col + " is out of bounds");
    }

    private static int getSixthElement(int row, int col) {
        row++;

        if (isInBounds(row, col)) {
            return matrix[row][col];
        }

        throw new IndexOutOfBoundsException("[Row]: " + row + " or [Col]: " + col + " is out of bounds");
    }

    private static int getSeventhElement(int row, int col) {
        row++;
        col++;

        if (isInBounds(row, col)) {
            return matrix[row][col];
        }

        throw new IndexOutOfBoundsException("[Row]: " + row + " or [Col]: " + col + " is out of bounds");
    }

    private static boolean isInBounds(int row, int col) {
        return 0 <= row && row < matrix.length && 0 <= col && col < matrix[row].length;
    }
}
