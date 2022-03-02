package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        while(true) {


            System.out.println("Enter your age:");
            int age = input.nextInt();

            while (!(age > 0 && age <= 120)) {
                System.out.println("Invalid entry");
                age = input.nextInt();
            }

            System.out.println("Would you like to continue?");
            String answer=input.next().toLowerCase();

            while (!(answer.equals("yes")||answer.equals("no"))){
                System.err.println("Invalid entry, please re-enter.Would you like to continue?");
                answer=input.next().toLowerCase();
            }

            if (answer.equals("no")){
                break;
            }


        }
        input.close();
    }
}
