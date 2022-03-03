package day14_String.task;

import java.util.Scanner;

public class EndsWith_ly {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String word=scan.next();
        if (word.charAt(word.length()-1)=='y'&&word.charAt(word.length()-2)=='l'){
            System.out.println("Really???");
        }else{
            System.out.println("never mind");
        }

    }
}
/*
    ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
*/
