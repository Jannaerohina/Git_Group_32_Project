package P02_ReverseArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P02_Version3 {
     /*
        2. Write a method that will take an array as an argument and reverse it.
      */

      /* Solution:
         1) Create a void (no return) type method that will accept an array argument (int array in our case), convert it into an ArrayList of Integers and use the Collections.reverse() ArrayList method to reverse the values. Print the ArrayList.
        2) Call the reverseArr3 method in the main method.
      */

    public static void reverseArr3 (Integer [] arr){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        Integer [] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArr3(arr2);
    }
}
