package day14_String.task;

import java.util.Scanner;

public class WithoutX {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        String word2="";

        if (word.charAt(0)=='x'){
            for (int i = 1; i < word.length(); i++) {
                word2+=word.charAt(i);
            }
            word=word2;
        }
        System.out.println(word);
    }
}
/*
    Ask user to enter a word. If the work starts with x, print the word without x.
        Input:
        xcode
        Output:
        code
*/
