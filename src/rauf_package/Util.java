package rauf_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Util {

    public static void main(String[] args) {

        System.out.println(isAnagram("silent","liste"));

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
     /*   for (int i = word.length()-1; i >= 0 ; i--) {
            reversed+=word.charAt(i);
        }*/

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

        int[] reversed = new int[arr.length];//{0,0,0,0

        for (int i = arr.length - 1, index = 0; i >= 0; i--, index++) {
            reversed[index] = arr[i];
        }

        return reversed;
    }

    /**
     * This method accepts Integer type array
     * to reverse array we used here Collections.reverse() method
     *
     * @return reversed ArrayList type of array
     */
    public static ArrayList<Integer> reverse(Integer[] arr) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.reverse(list);

        return list;
    }

    /**
     * This method accepts String type sentence with spaces
     * reversing sentence making an array and concatenating to reversed String from end
     */
    public static String reverseSentence(String sentence) {

        String[] arr = sentence.split(" ");
        String reversed = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            reversed += arr[i] + " ";
        }

        return reversed;
    }

    /**
     *This method accept int type number
     * @param number will be reversed inside the method
     * @return boolean type if reversed number is equal to original number
     */
    public static boolean isPalindrome(int number) {

        int reversed = 0;
        int copyOfNumber = number;

        while (number > 0) {
            reversed = (reversed * 10) + number % 10;
            number = number / 10;

        }
        if (reversed == copyOfNumber) {
            return true;
        }

        return false;
    }

    /**
     *This method accept int type
     * @param arr array
     * @return will be the max number in array
     * there is 3 way to find the max num in int array
     */
    public static int maxNumber(int [] arr){

        int max = 0;

        // --------------First way --------------
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }

        //---------------Second way --------------
        max = Arrays.stream(arr).max().getAsInt();


        //---------------Third way----------------
//        Arrays.sort(arr);
//        max=arr[arr.length-1];



        return max;

    }

    public static boolean isAnagram(String firstWord,String secondWord){

        if(firstWord.length()==secondWord.length())
        {
            for (int i = 0; i < firstWord.length(); i++) {
                if (secondWord.contains(firstWord.charAt(i)+"")){
                    secondWord = secondWord.replaceFirst(firstWord.charAt(i)+"","");
                }
            }
            if(secondWord.isEmpty()){
                return true;
            }else {
                return false;
            }

        }
        else
        {
            return false;
        }

    }




}
