package day15_ForLoop.tasks;

import java.util.Scanner;

public class SumOfStringsDigits {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String:");
        String word=input.next();

        int total=0;

        for (int i = 0; i <word.length() ; i++) {

            char ch=word.charAt(i);

            if (ch>='0'&&ch<='9'){
                total+=ch-48;
            }

        }
        System.out.println(total);
    }
}
/*
Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...
 */