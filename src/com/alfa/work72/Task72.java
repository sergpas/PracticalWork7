package com.alfa.work72;

public class Task72 {
    public static void main(String[] args) {
        int[] mas = {1,2,3,4,5,6,7,8,9,10};
        System.out.printf("Sum Odd Elements: " + sumOddElementsArray(mas));
    }
    public static int sumOddElementsArray(int[] array){
        int sumOdd=0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0) return -1;
            sumOdd+=(i % 2 == 0)?array[i]:0;
        }
        return sumOdd;
    }
}
