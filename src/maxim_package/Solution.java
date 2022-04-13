package maxim_package;

public class Solution {

    public static void main(String[] args) {

        String word = "Hello";
        System.out.println(reverse(word));
    }

        public static String reverse(String word) {

            String str = "";
            // index 01234


            for (int i = word.length() - 1; i >= 0; i--) {

                str += word.charAt(i);

            }
            return str;
        }
}