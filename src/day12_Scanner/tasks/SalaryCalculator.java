package day12_Scanner.tasks;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your hourly rate:");
        double hourlyRate=input.nextDouble();

        System.out.println("Enter your works hour in a week:");
        int hourPerWeek=input.nextInt();

        System.out.println("Enter state tax:");
        double stateTax=input.nextDouble();

        System.out.println("Enter federal tax:");
        double federalTax=input.nextDouble();

        double salary=hourlyRate*hourPerWeek*4;
        double totalTax=stateTax+federalTax;
        double netInCome=salary-(salary*totalTax);

        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netInCome = " + netInCome);


        input.close();


    }
}
