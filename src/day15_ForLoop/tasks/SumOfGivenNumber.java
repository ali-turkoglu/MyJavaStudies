package day15_ForLoop.tasks;

import java.util.Scanner;

public class SumOfGivenNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number:");

        int number=input.nextInt();
        int total=0;
        for (int i = 1; i < number ; i++) {
            System.out.print((total+=i)+" ");

        }
        input.close();
    }
}
/*
write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */