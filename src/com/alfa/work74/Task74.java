package com.alfa.work74;

import java.util.*;
import java.lang.*;

public class Task74 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Matrix Size: ");
        int matrixSize = scan.nextInt();
        int matrix[][] = createMatrix(matrixSize);
        System.out.println("Created Matrix:");
        printMatrix(matrix);
        transpositionMatrix(matrix);
        System.out.println("\nTransposition Matrix:");
        printMatrix(matrix);
    }

    public static void transpositionMatrix(int[][] matrix) {
        int matrixSize = matrix.length;
        int transpMatrix[][] = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                transpMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = transpMatrix[i][j];
            }
        }

    }

    public static int[][] createMatrix(int size) {
        if (size < 0) size = 0;
        int matrix[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 50);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] rowMatrix : matrix) {
            System.out.println(Arrays.toString(rowMatrix));
        }
    }
}
