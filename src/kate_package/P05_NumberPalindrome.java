package kate_package;

import java.util.Arrays;

public class P05_NumberPalindrome {
    /*
    5. Number palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward. The straight forward solution would be to convert number to string and use the above approach. Some interviewers will not allow it. So let’s take a look at what we can do here.

    Solution:
        1) Create a boolean return type method that will accept an int argument. The method will convert the int (given in the main method) to a String, and the String will subsequently be converted to an array of integers. The method will then check if the first half of integers in the array are the same as the second half of the Integers in the same array.  If the result is true, the method will return true, which means the original int is a palindrome. Otherwise, it will return false, which means the int variable is not a palindrome.
                a) Declare a boolean variable;
                b) Convert the int number to a String by using Integer.toString() method.
                c) Declare an empty array of integers that will have the same length as the convertedString.
                d) Use FOR loop to assign values of the String into to the array. Characters from the String can be accessed through the charAt() method. '0' char will need to be deducted with every iteration ('0' has an ASCII value of 48) in order for us to get the right number.
                e) Use nested FOR loop to compare if the first half of integers in the array are the same as the second half of the Integers in the same array. The iteration for the first half of the numbers of the array will start from 0 and go until the loop reaches the half of the array. In the meantime, the iteration for the second half of the numbers in the array will start from the end of the array (element at last index) and go until it reaches the half of the array. Use IF statement to check if the numbers in both iterations are equal. If yes, the number given in the main method is a Palindrome. If not, it's not a Palindrome.
         2) Call the isNumberPalindrome method in the main method using the num int as an argument.

     */



    public static boolean isNumberPalindrome (int number){

        boolean isNumPalindrome = false;

        String convertedString = Integer.toString(number);
        int [] nums = new int[convertedString.length()];

        for (int i = 0; i < convertedString.length(); i++){
            nums[i] = convertedString.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(nums));

        for(int i = 0; i < nums.length/2; i++){
            for (int j = nums.length-1; j > nums.length/2; j--) {
                if(nums[i] == nums[j]){
                    isNumPalindrome = true;
                }
            }
        }


        return isNumPalindrome;
    }


    public static void main(String[] args) {
        int num = 545;
        System.out.println(isNumberPalindrome(num));
    }
}
