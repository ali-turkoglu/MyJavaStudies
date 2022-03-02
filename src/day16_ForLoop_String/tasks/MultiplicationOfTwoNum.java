package day16_ForLoop_String.tasks;

import java.util.Scanner;

public class MultiplicationOfTwoNum {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter 2 positive numbers:");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int total=0;

        while ( !(num1>0&&num2>0)){
            System.out.println("Invalid entry, please enter positive numbers:");
            num1=input.nextInt();
            num2=input.nextInt();
        }
        for (int i = 1; i <=num2 ; i++) {
            total+=num1;

        }
        System.out.println(total);

    }
}
/*Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200

 */