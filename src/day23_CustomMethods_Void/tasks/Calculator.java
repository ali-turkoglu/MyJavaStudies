package day23_CustomMethods_Void.tasks;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1=scan.nextInt();

        System.out.println("Enter operator:");
        char operator=scan.next().charAt(0);

        System.out.println("Enter second number:");
        int number2=scan.nextInt();

        calculator(number1,number2,operator);

    }

    public static void calculator(int num1, int num2, char mathOperator){

        int result=0;
        if (mathOperator=='+'){
            System.out.println("result="+(num1+num2));
        }else if(mathOperator=='-'){
            System.out.println("result="+(num1-num2));
        }else if(mathOperator=='/'){
            System.out.println("result="+(num1/num2));
        }else if(mathOperator=='*'){
            System.out.println("result="+(num1*num2));
        }else{
            System.out.println("Invalid Operator");
        }

    }
}
/*create a method named calculator that passes three arguments (num1, num2, mathOperator),
prints the calculation result



 */