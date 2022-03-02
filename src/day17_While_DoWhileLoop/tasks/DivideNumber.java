package day17_While_DoWhileLoop.tasks;

import java.util.Scanner;

public class DivideNumber {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a positive number to divide");
        int num1=input.nextInt();
        System.out.println("Enter the other positive number");
        int num2=input.nextInt();
        int result=0;

        while (!(num1>0&&num2>0)){
            System.out.println("Invalid entry, re-enter the numbers:");
            num1=input.nextInt();
            num2=input.nextInt();
        }
        while (num1>=num2){
            num1=num1-num2;
            result++;
        }

        System.out.println("Result is "+result+" and remainder is "+num1);
    }
}
/*Write a program that can divide two positive numbers without
using / (division) and * (multiplication) operators.

 */