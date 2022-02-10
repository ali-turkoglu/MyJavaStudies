package week03;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        //getting the input from user, we need to create scanner object
        Scanner scan = new Scanner(System.in);


        //I want to declare 5 variables as double data type num1,num2,num3,num4 and total.
        double num1,            //declaring
                num2,
                num3,
                num4,
                total;

        num1 = scan.nextDouble();             //initializing with the user input
        System.out.println("num1 = " + num1);
        num2 = scan.nextDouble();
        System.out.println("num2 = " + num2);
        num3 = scan.nextDouble();
        System.out.println("num3 = " + num3);
        num4 = scan.nextDouble();
        System.out.println("num4 = " + num4);

        total = num1 + num2 + num3 + num4;
        System.out.println("total = " + total);




    }
}
