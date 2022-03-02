package day16_ForLoop_String.tasks;

import java.util.Scanner;

public class PositivesNegativesNumbers {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter 5 numbers:");

        int numpositive=0,numnegative=0;

        for (int i = 1; i <=5 ; i++) {
            int num=input.nextInt();
            if(num>=1){
                numpositive++;
            }else if(num<=-1){
                numnegative++;
            }

        }
        System.out.println(numpositive+" positive and "+numnegative+" negative");

    }
}
/*1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative


 */