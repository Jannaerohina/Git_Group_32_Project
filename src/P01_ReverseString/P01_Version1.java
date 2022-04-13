package P01_ReverseString;

public class P01_Version1 {
    /*
        1. String reverse. Write a method that will take one string as an argument and will return the reverse version of this string.
         */

        /*
        Solution:
            1) Create a String return type method that will accept a String argument, reverse it into a different String and return the new reversed version of the String. Declare an empty reversed String, where we will later store a value.
                a) Use FOR loop that will reach each index of the original String starting from the end (str.length()-1) until index 0 (indexes will be decrementing) and will keep adding the values to the reversed String via concatenation. This way, for example, value at the last index of the original String ("r") will be added to the empty String reversed, then the value at the next index of the original String will be added (concatenated) to the "r", and so on.
                b) chatAt() method will be used to read the values from each index of the original String.

             2) Call the reverseString method in the main method and print the result.
         */

    public static String reverseString(String str){
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {

        String str = "computer";
        System.out.println(reverseString(str));
    }
}
