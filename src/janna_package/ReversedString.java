package janna_package;

public class ReversedString {

    public static String reverse(String word){

        String word2 = "";
        for (int i = word.length() - 1; i >= 0 ; i--) {
            word2 += word.charAt(i);
        }
        return word2;

    }

    public static void main(String[] args) {

        System.out.println(reverse("banana"));
    }

}
