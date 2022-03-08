package day23_CustomMethods;

import java.util.Scanner;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        oddOrEven(10);

        int sayı = 50/25;
        oddOrEven(sayı);

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to learn its odd or even:");
        oddOrEven(scan.nextInt());
        System.out.println("--------------------------------------------------------------");

        ageOfPerson(1975);

        System.out.println("---------------------------------------------------------------");

        printNumbers(12,66);



    }



    // create a function that can check if a number odd number or even number
    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }
    }

    //creat a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        System.out.println("Person's age is "+ (2022-birthYear));
    }

    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){
        for (int i = x; i <y ; i++) {
            System.out.println(i);
        }
    }

}
