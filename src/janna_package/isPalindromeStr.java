package janna_package;

import static janna_package.ReversedString.reverse;

public class isPalindromeStr {

     /* String palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the     same backward as forward.
       isPal("anna")   -> true
       isPal("civic")  -> true
       isPal("apple")  -> false
       isPal("level")  -> true

    */

    public static boolean isPalindromeString(String word1) {

        reverse(word1);
        return word1.equals(reverse(word1));
    }

    public static void main(String[] args) {

        System.out.println(isPalindromeString("anna"));
    }
}


