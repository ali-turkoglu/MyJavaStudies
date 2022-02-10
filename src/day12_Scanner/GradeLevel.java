package day12_Scanner;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the grade level:");
        byte number=input.nextByte();
        String  result;

            if (number>1&&number<=5){
                result="Elementary School";
            }else if (number>5&&number<=8){
                result="Middle School";
            }else if (number>8&&number<=12){
                result="High School";
            }else if (number>12&&number<=16){
                result="Collage";
            }else if(number>16&&number<=18){
                result="Grad School";
            }else {
                result = "Invalid Grade Level";
            }

        System.out.println(number+". grade level is "+result);
    }
}
/*
Create a class called GradeLevel,
Given a number(byte) grade level determine and print which school type someone is in.
                grade level and types are:
                        1-5: Elementary school
                        6-8: Middle school
                        9-12: High school
                        13-16: College
                        17-18: Grad School

                        For Any Other grade: Invalid grade level given

                Note:
                    Solution 1: Use switch statement
                    Solution 2: use if & switch both
 */