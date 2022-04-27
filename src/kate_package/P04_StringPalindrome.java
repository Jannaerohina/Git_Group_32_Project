package kate_package;

public class P04_StringPalindrome {
    /*
     4. String palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward.
     Ex: racecar --> reads the same from either end

     Solution:
        1) Create a boolean return type method that will accept a String argument. The method will reverse the String (given in the main method) and compare both original and reversed versions. If the result is true, the method will return true, which means the String is a palindrome. Otherwise, it will return false, which means the String is not a palindrome.
            a) Declare a boolean variable along with an empty String reversed that we will later use to store values into.
            b) Use FOR loop that will start from the last index of the String until it reach index 0 and assign values in those indexes to the reversed String (through concatenation). The result of this will be a reversed String.
            c) Use IF statement to check whether the original String is the same as the reversed String by using the .equals() method. If the result is true, the String given in the main method is a palindrome. If false, it's not a palindrome.
         2) Call the isPalindrome method in the main method using the original String as an argument.

     */

    public static boolean isPalindrome (String s){

        boolean isWordPalindrome = false;
        String reversed = "";

        for (int i = s.length()-1; i >= 0; i--){
            reversed += s.charAt(i);
        }

        if (s.equals(reversed)) {
            isWordPalindrome = true;
        }
        else {
            isWordPalindrome = false;
        }

        return isWordPalindrome;
    }


    public static void main(String[] args) {

        String str = "apple";
        System.out.println(str + " is a palindrome: " + isPalindrome(str));
    }

}
