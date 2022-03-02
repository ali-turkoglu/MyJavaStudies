package day17_While_DoWhileLoop.tasks;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter numbers to sum ");
        int total=0;

        while (true){
            int num1=input.nextInt();
            if(num1<=0){
                break;
            }
            total+=num1;
            System.out.println("total:"+total);


        }

    }
}
/*Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop

 */