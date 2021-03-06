package com.telerikacademy.core;

import java.util.Scanner;

public class MultidimensionalArraysDemo {

    public static void main(String[] args) {
        // initialize matrix 3x3 (all equal to 0)
        // |0 |0 |0 |
        // |0 |0 |0 |
        // |0 |0 |0 |
        int[][] matrix1 = new int[3][3];

        // initialize matrix 3x3 elements and values
        // |1 |2 |3 |
        // |4 |5 |6 |
        // |7 |8 |9 |
        // number of rows = length of matrix2
        // matrix[2][0]
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // initialize matrix 3x3 elements and values
        // |0 |2 |4 |
        // |6 |8 |10|
        // |12|14|16|
        int[][] matrix3 = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                matrix3[row][col] = row * 3 * 2 + col * 2;
            }
        }

        // initialize matrix from the console where size is on first line and each row is entered on a new line on the console e.g.
        // 3
        // 1 2 3
        // 4 5 6
        // 7 8 9
        System.out.println("Enter matrix size and then each row on a new line:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int size = Integer.parseInt(line);
        int[][] matrix4 = new int[size][size];
        for (int i = 0; i < size; i++) {
            line = scanner.nextLine();
            String[] strArr = line.split(" ");
            for (int j = 0; j < size; j++) {
                matrix4[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        // print matrix on the console after reading it
        printMatrix(matrix4);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix4[i][j] = matrix4[i][j] * 2;
            }
        }

        // print matrix on the console after doubling each element
        printMatrix(matrix4);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix4[i][j] % 2 != 0) {
                    matrix4[i][j] = -1;
                }
            }
        }

        // print matrix on the console after leaving only even numbers
        printMatrix(matrix4);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("| %d |", matrix[i][j]);
            }
            System.out.println();
        }
    }

}
