package day14_String.task;

import java.util.Scanner;

public class IdentfyFirstLetter {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String word=scan.next();

        if (word.charAt(0)>='a'&&word.charAt(0)<='z'){
            System.out.println("First letter is lowercase letter.");
        }else if(word.charAt(0)>='A'&&word.charAt(0)<='Z'){
            System.out.println("First letter is uppercase letter.");
        }else if(word.charAt(0)>='0'&&word.charAt(0)<='9'){
            System.out.println("First letter is digit.");
        }else{
            System.out.println("First letter is special character");
        }

    }

}
/*
    Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
                if the word starts with uppercase letters, print "first character is lowercase letter"
                if the word starts with lowercase letters, print "first character is uppercase letter"
                if the word starts with special characters, print "first character is special character"


                HINT: 1. you need charAt() method
                2. Ascii Table*/
