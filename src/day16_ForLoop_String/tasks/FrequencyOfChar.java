package day16_ForLoop_String.tasks;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= input.nextLine();
        System.out.println("Enter a char to find its frequency in the String:");
        char ch=input.next().charAt(0);
        int count=0;


        for (int i = 0; i < str.length(); i++) {


            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}

/*Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4


 */