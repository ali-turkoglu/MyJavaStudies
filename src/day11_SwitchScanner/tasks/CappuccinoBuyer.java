package day11_SwitchScanner.tasks;

import java.util.Scanner;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of Cappuccino you want:");
        String size=input.next();

        switch (size){

            case "tall": case "grande": case "venti":
                if (size.equals("tall")){
                    System.out.println("Price is $3.69\n90 calories");
                }else if (size.equals("grande")){
                    System.out.println("Price is $3.99\n120 calories");
                }else{
                    System.out.println("Price is $4.29\n150 calories");
                }
                break;

            default:
                System.err.println("Invalid Size");
        }
        input.close();

    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given,
write a program that can display the price and calories of cappuccino

Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */