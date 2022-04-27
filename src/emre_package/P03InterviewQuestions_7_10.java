package emre_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P03InterviewQuestions_7_10 {
    public static int secMax(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        } return arr[1];
    }

    public static int secMax2(int [] arr) {

        Arrays.sort(arr);

        return arr[arr.length-2];
    }

    public static int secMax3(int [] arr){

        ArrayList<Integer>list=new ArrayList<>(arr.length);

        for(int each:arr){
            list.add(each);
        }

        list.removeIf(n->n==(Collections.max(list)));
        return Collections.max(list);
    }

    public static int secMax4(int [] arr){
        // this method is for if the number is repeated
        ArrayList<Integer>list=new ArrayList<>(arr.length);

        for(int each:arr){
            list.add(each);
        }
        list.removeIf(n-> (Collections.frequency(list,n)>1));
        Collections.sort(list);
        return list.get(list.size()-2);
    }

    public static int secMin(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        } return arr[1];
    }

    public static int nMax(int[] arr, int n) {

        Arrays.sort(arr);
        return arr[(arr.length-n)];
    }

    /*
        Q8:What is static keyword in java?
        - Static keyword in JAva is used for variables, class, methods and blocks. When a static member i sdeclared that can be accessed before any objects if its class are created and without reference to any object.

       Static members can be called by Class name, which is the appropriate way to call a static member.
       Static block only runs once when the class is executed. it won't be run for the second time.
       Static variables: a single copy of this variable will be shared among all objects at the class level. Static variables are , essentially global variables. All instances of the class share the same static variable.

        When to use static variables and methods?
        Static variables and methods should be used in cases where it's common for all objects.

        Q9- String Pool and == operator to compare references in Java?
        String objects can have two different location such as : Heap and pool.String objects can be created by two ways: String literal and new keyword. the new keyword creates the string object in the heap. String literal creates the String object in the pool.
        When an object created in the String pool that takes a memory in the Pool. if another object will be crated with same value in the pool that object reference will be pointed to the same location in the pool therefore there won't be second object crated and takes a space in the memory.  This is only special place for String objects created by Java developers.

        String str= "name"; --> Creates  an object in the Pool
        String s = new String("Welcome"); --> Creates and object in the Heap

        Comparing String Objects by equals() method and == operator?
       String objects should be compared by String equals() method. String equals method compares actual value of the strings. When an == operator is used to compare string object that is checking if those two Objects pointing if the same location in the memory. This will not be the healthiest way to compare String objects since string objects can have two different location places in the memory.

     */

    /*
        Q10: Swap values of two variables without creating any extra variables?

        int j=15;
        int i =10;

        j=j+i; // j= 15+10=25;
        i=j-i; // i=25-10=15;
        j=j-i; // j=25-15=10;



     */
    public static void main(String[] args) {
       int [] arr={4,781,99,103};
        System.out.println(secMax(arr));
        System.out.println(secMax2(arr));
        System.out.println(secMax3(arr));
        System.out.println(secMax4(arr));
        System.out.println(secMin(arr));
        System.out.println(nMax(arr, 3));
    }
}
