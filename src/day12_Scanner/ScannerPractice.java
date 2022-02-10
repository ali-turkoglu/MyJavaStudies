package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter a number 1 to 7");
        byte num1=(byte)input.nextInt();
        String result;

        switch (num1){
            case 1:
                result="Monday";
                break;
            case 2:
                result="Tuesday";
                break;
            case 3:
                result="Wednesday";
                break;
            case 4:
                result="Thursday";
                break;
            case 5:
                result="Friday";
                break;
            case 6:
                result="Saturday";
                break;
            case 7:
                result="Sunday";
                break;
            default:
                result="Invalid Number";

        }
        input.close();
        System.out.println(result);


    }
}
