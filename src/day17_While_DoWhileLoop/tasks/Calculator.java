package day17_While_DoWhileLoop.tasks;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int result=0;

        System.out.println("Enter your first number:");
        int num1=input.nextInt();

        System.out.println("Enter a math operator: ");
        char ch=input.next().charAt(0);

        System.out.println("Enter your second number:");
        int num2=input.nextInt();


        while (!(ch=='+'||ch=='-'||ch=='/'||ch=='*')){
            System.err.println("Invalid operator, Re-enter the operator: ");
            ch=input.next().charAt(0);
        }

        if (ch=='+'){
            result=num1+num2;
        }else if(ch=='/'){
            result=num1/num2;
        }else if(ch=='*'){
            result=num1*num2;
        }else {
            result=num1-num2;
        }



        System.out.println(""+num1+ch+num2+"="+result);
    }
}
/*write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)


 */