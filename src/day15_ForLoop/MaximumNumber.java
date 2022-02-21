package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int number=0;
        int max=-2147483648;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number:");
            number =input.nextInt();

            if (number>max){
                max=number;

            }

        }
        System.out.println("max number is "+max);



        //write a program that asks the user to enter a number 5 times
        //return the max number.
    }
}
