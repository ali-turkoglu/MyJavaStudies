package day15_ForLoop.tasks;

import java.util.Scanner;

public class RetiveTheGivens {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter something :)");
        String word=input.next();
        String charNumber="";
        String charAlphabet="";
        String charSymbols="";

        for (int i = 0; i <word.length() ; i++) {

            char ch=word.charAt(i);

            if (ch >= '0'&& ch<='9'){
                charNumber+=ch;
            }else if (ch>='A'&&ch<='Z'){
                charAlphabet+=ch;
            }else if (ch>='a'&&ch<='z'){
                charAlphabet+=ch;
            }else{
                charSymbols+=ch;
            }

        }
        input.close();

        System.out.println("charNumber = " + charNumber);
        System.out.println("charAlphabet = " + charAlphabet);
        System.out.println("charSymbols = " + charSymbols);


    }
}
/*
rite a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */