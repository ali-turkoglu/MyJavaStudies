package day15_ForLoop.tasks;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();
        int total=number;
        for (int i = number-1; i >0 ; i--) {

            System.out.print((total*=i)+" ");

        }
        input.close();
    }
}
/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */