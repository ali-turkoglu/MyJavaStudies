package day13_String.tasks;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {

        System.out.println("Enter a sentence:");
        Scanner input=new Scanner(System.in);
        String sentence=input.nextLine();
        System.out.println("sentence = " + sentence);

        char firstChar=sentence.charAt(0);
        System.out.println("firstChar = " + firstChar);

        char lastChar=sentence.charAt((sentence.length()-1));
        System.out.println("lastChar = " + lastChar);


        input.close();
    }

}
