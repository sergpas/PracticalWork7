package com.alfa.work74;
import java.util.Arrays;
import java.lang.*;
import java.util.Scanner;

public class Task74 {
    public  static  void  main(String[]  args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Matrix Size: ");
//        int matrixSize = scan.nextInt();
        int matrixSize = 5;
        if (matrixSize < 0) {
            System.out.printf("Invalid Matrix Size: " + matrixSize);
            return;
        }
        int matrix[][] = createMatrix(matrixSize);
        System.out.println("Created Matrix:");
        printMatrix(matrix);
        transpositionMatrix(matrix);
        System.out.println("\nTransposition Matrix:");
        printMatrix(matrix);
    }

    public static void transpositionMatrix(int[][] matrix){
        int matrixSize = matrix.length;
        int transpMatrix[][] = new int[matrixSize][matrixSize];
        for(int i=0;i<matrixSize;i++){
            for(int j=0;j<matrixSize;j++) {
                transpMatrix[j][i] = matrix[i][j];
            }
        }
        for(int i=0;i<matrixSize;i++){
            for(int j=0;j<matrixSize;j++) {
                matrix[i][j] = transpMatrix[i][j];
            }
        }

    }

    public  static int[][] createMatrix(int size){
        int matrix[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int)(Math.random()*50);
            }
        }
        return  matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int[] rowMatrix : matrix) {
            System.out.println(Arrays.toString(rowMatrix));
        }
    }
}
