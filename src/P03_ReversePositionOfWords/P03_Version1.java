package P03_ReversePositionOfWords;

import java.util.Arrays;

public class P03_Version1 {
     /*
    Write a method that will take a string as an argument. The method will reverse the position of words and return it.
     */

    /*
    Solution:
        1) Create a String return type method that will accept a String argument.
        2) Declare an empty reversedStr String - it will be later used to store a value into.
        3) Convert the original String (from argument) into an array by using the split() method, separated by a space (" ").
        4) Declare an empty array reversedArr that will have the same size as the first array.
        5) Use FOR loop to run through the indexes of both arrays:
            a) from last index to 0 of the original array, where indexes will be decrementing until they reach 0
            b) from index 0 to the last index of the reversed array, where indexes will be incrementing until they reach the end of the array
          This way, for example, during the 1st iteration of the FOR loop, the value at the last index of the original array ("Java") will be placed (assigned) into index 0 of the reversed array, and so on.
        6) Convert the reversed array into a String by running a FOR EACH loop. The loop will read through each index of the reversed array and keep adding those values into the String. Since each word must be separated by a space, we will be adding a space with each iteration.
        7) Since we ended up with some extra space at the beginning of our new (reversedStr) String, we should eliminate all the extra space. To do that, we will use the trim() String method.
        8) Return the reversed String.
        9) Call the reversePositionWords method in the main method.
     */

    public static String reversePositionWords (String str){
        String reversedStr = "";
        String [] arr = str.split(" ");
        String [] reversedArr = new String [arr.length];

        for(int i = arr.length-1, j = 0; i >= 0; i--, j++){
            reversedArr[j] = arr[i];
        }

        System.out.println(Arrays.toString(reversedArr));

        for (String each: reversedArr) {
            reversedStr += " " + each;
        }

        reversedStr = reversedStr.trim();
        return reversedStr;
    }

    public static void main(String[] args) {

        String s = "I love Java";

        System.out.println(reversePositionWords(s));

    }
}
