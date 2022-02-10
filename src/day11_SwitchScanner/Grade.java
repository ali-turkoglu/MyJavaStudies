package day11_SwitchScanner;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        System.out.println("Please enter your grade:");
        Scanner scan=new Scanner(System.in);
        String grade =scan.next();
        String result="";

        switch (grade){
            case "A": case"a":
                result="Excellent";
                break;
            case "B":
                result="Great";
                break;
            case "C":
                result="Good";
                break;
            case "D":
                result="Passed";
                break;
            case "F":
                result="Failed";
                break;
            default:
                result="Invalid";


        }
        System.out.println(result);


    }
}
/*
Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            "A": excellent
            "B": great job
            "C": good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */