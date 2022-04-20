package group_tasks;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
         /*
        4. String palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward.

        // isPal("anna")   -> true
  // isPal("civic")  -> true
  // isPal("apple")  -> false
  // isPal("level")  -> true

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();
        String word2 = "";

        for (int i = word.length() - 1; i >= 0 ; i--) {
            word2 += word.charAt(i);
        }

        if (word.equals(word2)){
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }
}
