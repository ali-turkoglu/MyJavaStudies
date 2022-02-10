package day08_IfStatements.day13_String.tasks;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        System.out.println("Enter a word");
        Scanner input=new Scanner(System.in);
        String w1=input.nextLine();

        System.out.println("Enter a different word");
        String w2=input.nextLine();

        input.close();

        if (w1.length()>w2.length()){
            System.out.println("w1 is longer than w2");
        }else if (w1.length()<w2.length()){
            System.out.println("w2 is longer than w1");
        }else {
            System.out.println("w1 and w2 are equals");
        }



    }
}
