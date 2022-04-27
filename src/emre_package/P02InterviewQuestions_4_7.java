package emre_package;

import java.util.Arrays;

public class P02InterviewQuestions_4_7 {

        public static boolean isPal(String str){
            //String palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward.

            int j=str.length()-1;
            boolean isPalindrome=true;
            for(int i =0; i<str.length()/2;i++){
                if(str.charAt(i) !=str.charAt(j-i)){
                    isPalindrome=false;
                    break;
                }
            } return isPalindrome;
        }

        public static boolean isPalNum(int num){
            // isPalNum(545)   -> true
            // isPalNum(1001)  -> true
            // isPalNum(13)    -> false
            // isPalNum(33)    -> true
            int newNum=0;
            int holder=num;
            String s="";
            while(num>0){

                newNum=num%10;
                s+=newNum;
                num=num/10;
            }
            int reverseNum= Integer.parseInt(s);

            return reverseNum==holder;
        }

        public static int max(int[] arrNum){
            int max=arrNum[0];
            for (int i =1;i< arrNum.length;i++){
                if(arrNum[i]>max){
                    max=arrNum[i];
                }
            } return max;
        }
        public static int max2(int [] arrNum){
            Arrays.sort(arrNum);
            int max=arrNum[arrNum.length-1];
            return max;
        }

        public static int max3(int [] arrNum){
            // This solution is also useful to find second, 3rd or other largest numbers. Basically we are swapping locations of the numbers and arranging array to decrement from maximum to the minimum.
            for (int i = 0; i < arrNum.length; i++) {
                for (int j = i+1; j < arrNum.length; j++) {
                    if(arrNum[j]>arrNum[i]){
                        int temp=arrNum[i];
                        arrNum[i]=arrNum[j];
                        arrNum[j]=temp;
                    }

                }

            }return arrNum[0];
        }

        public static int min(int [] arrNum){
            int min=arrNum[0];
            for (int i = 1; i < arrNum.length; i++) {
                if(arrNum[i]<min){
                    min=arrNum[i];
                }

            } return min;
        }

        public static int min2(int [] arrNum){
            Arrays.sort(arrNum);
            int min = arrNum[0];
            return min;
        }

        public static int min3(int [] arrNum){
            // Same technique on previous max number, we are comparing array numbers one another and re-arranging the array incrementing from smaller to teh larger.
            for (int i = 0; i < arrNum.length; i++) {
                for (int j = i+1; j < arrNum.length; j++) {
                    if(arrNum[j]<arrNum[i]){
                        int temp=arrNum[i];
                        arrNum[i]=arrNum[j];
                        arrNum[j]=temp;
                    }

                }

            } return arrNum[0];
        }
        public static void main(String[] args) {
            System.out.println(isPal("apple"));
            System.out.println(isPal("anna"));
            System.out.println(isPalNum(1001));
            System.out.println(isPalNum(13));
            int [] arrNum={4,781,8,99,103};
            System.out.println(max(arrNum));
            System.out.println(max2(arrNum));
            System.out.println(max3(arrNum));
            System.out.println(min(arrNum));
            System.out.println(min2(arrNum));
            System.out.println(min3(arrNum));
        }
    }


