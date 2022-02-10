package day10_NestedIf;

import java.util.Scanner;

public class NameOfMonths2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a month number:");
        int number= input.nextInt();

        String month=(number >= 1 && number <= 12)?
           (number==1)?"January":(number ==2)?"February":(number ==3)?"March":(number ==4)?"April":(number ==5)?"May":(number ==6)?"June":(number ==7)?"July"
                   :(number ==8)?"August":(number ==9)?"September":(number ==10)?"October":(number ==11)?"November":"December"
        :"Invalid Number";
        System.out.println(month);


    }
}
