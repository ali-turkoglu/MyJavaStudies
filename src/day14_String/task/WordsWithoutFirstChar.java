package day14_String.task;

import day21_ArrayUtility_ForEachLoop.tasks.SortArray;

import java.util.Scanner;

public class WordsWithoutFirstChar {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter two words");
        String word1=scan.next();
        String word2=scan.next();

        String result="";
        for (int i = 1; i < word1.length(); i++) {
            result+=word1.charAt(i);
        }
        for (int i = 1; i < word2.length(); i++) {
            result+=word2.charAt(i);
        }
        System.out.println(result);
    }
}
/*
    Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
        Input:
        apple
        banana
        Output:
        ppleanana*/
