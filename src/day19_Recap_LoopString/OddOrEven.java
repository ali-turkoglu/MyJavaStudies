package day19_Recap_LoopString;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        while (true) {
            System.out.println("Enter a number:");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even number.");
            } else {
                System.out.println(num + " is odd number.");
            }

            System.out.println("Would you like to enter another number?");
            String a = input.next().toLowerCase();  //

            if (!(a.equals("no") || a.equals("yes"))) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            if (!(a.equals("yes"))) {
                System.out.println("Thank you");
                break;
            }


        }
    }
}
