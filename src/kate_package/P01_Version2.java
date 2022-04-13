package kate_package;

import java.util.Arrays;

public class P01_Version2 {

     /*
        1. String reverse. Write a method that will take one string as an argument and will return the reverse version of this string.
         */

    /*
    Solution:
        1) Create a String return type method that will accept a String argument, convert it into an array, reverse the array into a new reversed array, and then convert the reversed array into a new String. The method will return the new (reversed) String:
            a) Convert the original String str into an array of Strings by using the split() method, where the separator is just an empty space ("") --> created a String array arr.
            b) Create an empty array with the same size as the original array arr.
            c) Use the FOR loop that will start iterating from the last index of the original array and from the first index of the reverse array. The indexes of the original array will be decrementing (until they reach index 0), while the indexes of the reversed array will be incrementing (until they reach last index). This way, for example, during the 1st iteration of the FOR loop, the value at the last index of the original array ("r") will be placed at index 0 of the reversed an array, and so on until the loop completes.
            d) Convert the reverse array into a String by:
              i) Declaring an empty String reverse that will hold future values.
              ii) Running FOR EACH loop that will iterate through the reversed loop and assign each value (starting from index 0 until the end) to a String reversed.
        2) Call the reverseString2 method in the main method and print the result.
     */

    public static String reverseString2(String str) {

        String[] arr = str.split("");
        String[] reversed = new String[str.length()];
        String reverse = "";

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }
        System.out.println(Arrays.toString(reversed));

        for (String each : reversed) {
            reverse += each;
        }

        return reverse;
    }

    public static void main(String[] args) {

        String str = "computer";
        System.out.println(reverseString2(str));

    }

}
