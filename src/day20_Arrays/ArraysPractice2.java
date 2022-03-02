package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        char[] letters=new char[26];
        //letters[0]='A';
        int count=0;

        for (char i = 'A'; i <= 'Z'; i++) {


            //char ch='A';
            letters[count]=i;
            count++;

        }
        System.out.println(Arrays.toString(letters)); // [A-Z]

        System.out.println("-------------------------------------------");


        char[] letters2=new char[26];

        for (char i = 'A',j=0; i <='Z'&&j<letters.length ; i++,j++) {

            letters2[j]=i;
        }
        System.out.println(Arrays.toString(letters2)); // [A-Z]

        System.out.println("----------------------------------------");

        char[] letters3=new char[26];

        for (char i='Z',j=0;i>='A'&&j<letters3.length;i--,j++){
            letters3[j]=i;

        }
        System.out.println(Arrays.toString(letters3));







    }
}
