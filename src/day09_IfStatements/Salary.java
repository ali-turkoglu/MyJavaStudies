package day09_IfStatements;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        System.out.println("Enter your salary:");

        Scanner input=new Scanner(System.in);

        double salary=input.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried=input.nextBoolean();
        double tax;
        double totalTax=0;
        double salaryAfterTax;


        if (salary>=130000){
            tax=0.35;
        }else if (salary>=100000&&salary<130000){
            tax=0.30;
        }else if (salary>=80000&&salary<100000){
            tax=0.25;
        }else{
            tax=0.20;
        }

        if (isMarried){
            totalTax=salary*(tax-0.05);
        }else{
            totalTax=salary*tax;
        }
        salaryAfterTax=salary-totalTax;
        System.out.println("after taxes Your salary  is: "+salaryAfterTax);
    }
}
/*Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax


 */