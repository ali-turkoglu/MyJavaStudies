package day11_SwitchScanner;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {

        System.out.println("Please enter a number from 0 to 9");

        Scanner scan=new Scanner(System.in);
        int number = scan.nextInt();


        String result=(number<=9&&number>=0)?
                (number==0)?"Zero":(number==1)?"One" :(number==2)?"Two" :(number==3)?"Three" :(number==4)?"Four" :(number==5)?"Five"
                        :(number==6)?"Six" :(number==7)?"Seven" :(number==8)?"Eight" :"Nine"
                :"Invalid Number";

        System.out.println(number+" is " + result);


    }
}
/*Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary

 */