package rauf_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice {

    public static void main(String[] args) {
        


    }


    /**
     * This method accepts String type parameter
     *
     * @param word will be reversed inside the method
     * @return will be reversed version of word
     */
    public static String reverse(String word) {

        String reversed = "";

        //==================First way==================
        /*
        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed+=word.charAt(i)+"";
        }
         */

        //==================Second way==================
       /* String [] letters = word.split("");
        for (int i = letters.length-1; i >=0 ; i--) {
            reversed+=letters[i];
        }*/

        //==================Third way==================
        StringBuilder input = new StringBuilder(word);
        reversed = input.reverse().toString();


        return reversed;
    }


    /**
     * This method accepts int type array parameter
     * returns back reversed int array
     */
    public static int[] reverse(int[] arr) {

        int[] reversed = new int[arr.length];

        for (int i = arr.length - 1, index = 0; i >= 0; i--, index++) {
            reversed[index] = arr[i];
        }

        return reversed;
    }

    /**
     * This method accepts Integer type array
     * to reverse array we used here Collections.reverse() method
     * @return reversed ArrayList type of array
     */
    public static ArrayList<Integer> reverse(Integer [] arr) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.reverse(list);

        return list;
    }

    /**
     * This method accepts String type sentence with spaces
     * reversing sentence making an array and concatenating to reversed String from end
     */
    public static String reverseSentence(String sentence){

        String [] arr = sentence.split(" ");
        String reversed = "";

        for (int i = arr.length-1; i >=0 ; i--) {
            reversed+= arr[i]+" ";
        }

        return reversed;
    }




}
