package day16_ForLoop_String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word for checking palindrome");
        String word=input.next();
        String word2="";

        for (int i = word.length()-1; i >=0; i--) {

            char ch=word.toLowerCase().charAt(i);
            word2+=ch;

        }
        System.out.println(word);
        System.out.println(word2);

        System.out.println(word.equals(word2)? "This is palindrome":"This is not palindorme");
    }

}
/*
Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */