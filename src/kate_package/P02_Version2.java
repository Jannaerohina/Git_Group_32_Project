package kate_package;

import java.util.Arrays;

public class P02_Version2 {
     /*
    2. Write a method that will take an array as an argument and reverse it.
     */

    /* Solution:
    1) Create an int array return type method that will accept an array argument (int array in our case), reverse it into a different array and return the reversed array:
            a) Use FOR loop to assign values from the initial arr array into the reversed array in the opposite order (ex. value at the 1st index of the original array will be placed into the last index of the reversed array, and so on.
            b) Return the reversed array.
     2) Call the reverseArr2 method in the main method and print the result.

     */

    public static int [] reverseArr2 (int [] arr){
        int [] reversed = new int [arr.length];

        for(int i = arr.length-1; i >= 0; i--){
            reversed[arr.length-1-i] = arr[i];
        }
        return reversed;
    }

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(reverseArr2(arr)));

    }
}
