package day18_NestedLoop.tasks;

import java.util.Scanner;

public class Calculation {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        while (true) {

            System.out.println("Enter the first number:");
            int num1 = input.nextInt();
            System.out.println("Enter a math operator(+,-,/,*)");
            String operator = input.next();

            while (!(operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*"))) {
                System.out.println("Invalid operator, Please re-enter");
                operator = input.next();
            }
            System.out.println("Enter the second number:");
            int num2 = input.nextInt();

            switch (operator) {
                case "+":
                    System.out.println(num1 + "+" + num2 + "= " + (num1 + num2));
                    break;
                case "-":
                    System.out.println(num1 + "-" + num2 + "= " + (num1 - num2));
                    break;
                case "/":
                    System.out.println(num1 + "/" + num2 + "= " + (num1 / num2));
                    break;
                case "*":
                    System.out.println(num1 + "*" + num2 + "= " + (num1 * num2));
                    break;
            }

            System.out.println("Do you want to continue?");
            String a = input.next().toLowerCase();

            while (!(a.equals("yes")||a.equals("no"))){
                System.out.println("Re-enter your answer");
                a=input.next().toLowerCase();
            }
            if(a.equals("no")){
                System.out.println("Thanks for using our software...");
                break;
            }


        }

    }
}
/*Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry



 */