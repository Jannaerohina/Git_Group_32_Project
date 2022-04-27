package janna_package;

import java.util.Arrays;

public class ArrayReverse {

    /*
    Array reverse. Write a method that will take an array as an argument and reverse it.
     */

   public static int [] arrayReverse(int [] arr){

       int [] arr2 = new int[arr.length];

       for (int i = arr.length - 1; i >= 0 ; i--) {
           arr2[arr.length - 1 - i] = arr[i];
       }

       return arr2;
   }

    public static void main(String[] args) {

       int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arrayReverse(arr)));
    }
}

