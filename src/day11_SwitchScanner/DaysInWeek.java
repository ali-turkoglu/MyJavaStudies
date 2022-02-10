package day11_SwitchScanner;

import java.util.Scanner;
import java.lang.invoke.SwitchPoint;

public class DaysInWeek {
    public static void main(String[] args) {

        System.out.println("Please enter a number:");
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();

        String day="";

        switch (number){

            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
                day="Sunday";
                break;
            default:
                day="Invalid";

        }
        System.out.println(number+". day is "+day);

    }
}
