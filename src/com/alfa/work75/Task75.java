package com.alfa.work75;

import java.util.Arrays;
import java.util.Scanner;

public class Task75 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Didits String: ");
        String inString = scan.nextLine();
        int[] mas = countOfSequenceNumbers(inString);
        System.out.println(Arrays.toString(mas));
    }

    public static int[] countOfSequenceNumbers(String numbers) {
        String digits = "123456789";
        int[] masCntDidits = new int[9];
        for (int i = 0; i < numbers.length(); i++) {
            int idx = digits.indexOf(numbers.charAt(i));
            if (idx < 0) continue;
            masCntDidits[idx]++;
        }
        return  masCntDidits;
    }
}
