package kate_package;

import java.util.Arrays;

public class P07_SecondMinMaxNumber_InArray {
     /*

    Find the second min/max number from an array. Write a method that accepts int array as an argument and returns second or n min/max number from the given array.

     */

    public static int secondMaxNumber(int[] arr) {
        int max = 0;
        int secondMax = 0;
        int index = 0;
        int[] arr2 = new int[arr.length - 1];

        // find 1st max number in array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // sort our original array in order to use binarySearch
        Arrays.sort(arr);
        // looks for the index of max number
        index = Arrays.binarySearch(arr, max);

        // creates a new array without the 1st max number in it
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == index) {
                continue;
            } else {
                arr2[i] = arr[i];
            }
        }

        // look for the new max number in the new array
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > secondMax) {
                secondMax = arr2[i];
            }
        }

        return secondMax;
    }

    public static int secondMinNumber(int[] arr) {
        int min = 0;
        int secondMin = 0;
        int index = 0;
        int[] arr2 = new int[arr.length - 1];

        // find 1st min number in array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // sort the original array first, in order to use binarySearch
        Arrays.sort(arr);
        // looks for the index of min number
        index = Arrays.binarySearch(arr, min);

        // creates a new array without the original (1st) min number in it
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == index) {
                continue;
            } else {
                arr2[i] = arr[i];
            }
        }

        // looks for the new min number in the new array
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < secondMin) {
                secondMin = arr2[i];
            }
        }
        return secondMin;
    }

    public static int secondMinNumberVersion2 (int [] arr){
        Arrays.sort(arr);
        int secondMinNumber = arr[1];

        return secondMinNumber;
    }

    public static int secondMaxNumberVersion2 (int [] arr){
        Arrays.sort(arr);
        int secondMaxNumber = arr[arr.length-2];

        return secondMaxNumber;
    }

    public static void main(String[] args) {
        int[] arr = {12, 6, -8, 23, 67, -3, 0};
        System.out.println(secondMaxNumber(arr));
        System.out.println(secondMinNumber(arr));
        System.out.println(secondMaxNumberVersion2(arr));
        System.out.println(secondMinNumberVersion2(arr));
    }
}
