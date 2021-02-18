package com.alfa.work73;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Task73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Matrix Size: ");
        int matrixSize = scan.nextInt();
        if (matrixSize < 0) {
            System.out.printf("Invalid Matrix Size: " + matrixSize);
            return;
        }
        for (int[] rowMatrix : createMatrix(matrixSize)) {
            System.out.println(Arrays.toString(rowMatrix));
        }
    }

    public static int[][] createMatrix(int size) {
        int matrix[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (i + 1) + (j * size);
            }
        }
        return matrix;
    }
}
