package P02_ReverseArray;

import java.util.Arrays;

public class P02_Version1 {
    /*
    2. Write a method that will take an array as an argument and reverse it.
     */

    /* Solution:
     1) Create a void (no return) type method that will accept an array argument (int array in our case), reverse it into a different array and print the reversed array.
            a) Declare an empty reversed String, where we will later store a value.
            b) Use FOR loop, where the indexes of the original array arr start from the end, while indexes at the reversed array start from 0. Indexes of the original array will be decrementing until the reach 0, while indexes of the reversed array will be incrementing until they reach last index. Therefore, as an example, during the 1st iteration of the FOR loop, the value of the last index of the original array will be placed into index 0 of the reversed array, and so on.
       2) Call the reverseArr method in the main method.
     */

    public static void reverseArr (int [] arr){
        int [] reversed = new int[arr.length];

        for(int i = arr.length-1, j = 0; i >= 0; i--, j++){
            reversed[j] = arr[i];
        }
        System.out.println(Arrays.toString(reversed));
    }


    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArr(arr);
    }
}
