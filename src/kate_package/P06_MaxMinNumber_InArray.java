package kate_package;

import java.util.Arrays;

public class P06_MaxMinNumber_InArray {

/*
     6. Max/min number from an array. Write a method that will accept an array of int as an argument and it returns the max/min number from a given array.

     Solution:
            1) Create 2 int return type methods that will accept an int [] array as an argument. Both will return an int value:
                    a) The 1st method will look for the largest number in the array.
                       Declare a max int value and assign the value of the 1st element in the array to it (this will be our default value for now). Use FOR loop to iterate through the array and look for the largest value via the IF statement. The IF statement will check if each number in the array is larger than the max number. If it is, the value of the max number will be reassigned to that number. The loop will continue until the end of the array is reached. The method will return the largest number.
                    b) The 2nd method will look for the smallest number in the array.
                    Declare a min int value and assign the value of the 1st element in the array to it (this will be our default value for now). Use FOR loop to iterate through the array and look for the smallest value via the IF statement. The IF statement will check if each number in the array is smaller than the min number. If it is, the value of the min number will be reassigned to that number. The loop will continue until the end of the array is reached. The method will return the smallest number.
            2) Call both methods in the main method. The array of numbers declared in the main method will be the argument for both.
     */

    public static int maxNumInArray(int[] arr) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int minNumInArray(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] arr = {1, 40, 50, 20, 6, 100, -46};
        System.out.println("Max number is :" + maxNumInArray(arr));
        System.out.println("Min number is :" + minNumInArray(arr));
    }
}
