package com.alfa.work71;
import java.util.Scanner;
import java.util.Arrays;

public class Task71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Massive Size: ");
        int masSize = scan.nextInt();
        if(masSize < 0) {
            System.out.printf("Invalid Massive Size: "+masSize);
            return;
        }
        System.out.printf("Massive: "+Arrays.toString(createArray(masSize)));
    }
    public static int[] createArray(int size){
        int[] mas = new int[size];
        for(int i = 0; i < mas.length; i++){
            mas[i] = (i+1)*2;
        }
        return mas;
    }
}
