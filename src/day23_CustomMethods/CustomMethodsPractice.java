package day23_CustomMethods;

import java.util.Arrays;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("----------------------------------------------");
        helloCydeo5Times();
        System.out.println("----------------------------------------------");
        evenNumbers();
    }

    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }

    public static void evenNumbers(){
        int[] evenNumbers=new int[50];
        for (int i = 2,j=0; i <=100 ; i+=2) {
            if(i%2==0){
                evenNumbers[j]=i;
                j++;
            }
        }
        System.out.println(Arrays.toString(evenNumbers));
    }


}
