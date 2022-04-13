package emre_package;

import java.util.Arrays;

public class P01InterviewQuestions {


    public static String reverse(String str){
          /*
    // reverseStr("apple")  -> elppa
  // reverseStr("John")   -> nhoJ
  // reverseStr("phone")  -> enohp
  // reverseStr("123456") -> "654321"
     */

        String reversed="";
        for (int i = str.length()-1; i >=0; i--) {
            reversed+=str.charAt(i);
        } return reversed;
    }

    public static String reverse2(String str){
        char [] arr=str.toCharArray();
        String reversed="";
        for (int i = arr.length-1; i >= 0; i--) {
            reversed+=""+arr[i];
        } return reversed;

    }

    public static String [] reverseArr(String [] str){
        // reverse an array
        String [] newArr=new String[str.length];
        int k=0;
        for (int i = str.length-1; i >=0 ; i--) {
            newArr[k]=str[i];
            k++;
        }return newArr;
    }

    public static String reverseWord(String str){
        //reverse the words in string
        String [] newArr=str.split(" ");
        String reversed="";
        for (int i = newArr.length-1; i >=0 ; i--) {
            reversed+=newArr[i]+" ";
        } return reversed;
    }
    public static void main(String[] args) {
        System.out.println(reverse("apple"));
        System.out.println(reverse2("John"));
        String [] str= {"Emre","John","Nadir"};
        System.out.println(Arrays.toString(reverseArr(str)));
        System.out.println(reverseWord("apple banana kiwi"));
    }

}
