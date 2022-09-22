package test;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Boolean continueApp = true;

        while (continueApp) {

            System.out.println("Please enter a word to learn if it is Palindrome:");

            String str = scan.next();

            String reverseStr = "";

            for (int i = str.length() - 1; i >= 0; i--) {

                reverseStr += str.charAt(i);

            }

            if (str.equalsIgnoreCase(reverseStr)) {
                System.out.println(str + " is Palindrome");
            } else {
                System.out.println(str + " is not Palindrome");
            }


            boolean isanswerTrue = true;
            while (isanswerTrue) {
                System.out.println("Do you want to enter a new word to check?(Y/N)");

                String answer = scan.next();


                if (answer.equalsIgnoreCase("y")) {
                    continueApp = true;
                    isanswerTrue = false;

                } else if (answer.equalsIgnoreCase("n")) {
                    continueApp = false;
                    isanswerTrue = false;

                } else {
                    System.out.println("Please enter a valid answer:");

                }
            }


        }
    }

}
