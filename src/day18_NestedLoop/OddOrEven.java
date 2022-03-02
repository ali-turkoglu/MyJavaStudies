package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        while (true) {
            System.out.println("Enter a number:");
            int num=input.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even number.");
            } else {
                System.out.println(num + " is odd number.");
            }

            System.out.println("Would you like to enter another number?");
            String a = input.next().toLowerCase();  //

            while ( !(a.equals("no")||a.equals("yes"))){
                System.err.println("Please re-enter, would you like to enter another number");
                a=input.next().toLowerCase();
            }

            if (a.equals("no")){
                break;
            }

        }


    }
}
/*Write a program that asks user to enter a number , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enters invalid answer, repeat the previous steps


 */