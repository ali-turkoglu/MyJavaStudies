package day08_IfStatements.day13_String.tasks;

import java.util.Scanner;

public class EqualsWords {
    public static void main(String[] args) {

        System.out.println("Enter two words:");
        Scanner input=new Scanner(System.in);
        String w1=input.next();
        String w2=input.next();

        if (w1.equals(w2)){
            System.out.println("w1 and w2 are the same.");
        }else{
            System.out.println("The words are not the same.");
        }
        input.close();


    }
}
