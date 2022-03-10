package day23_CustomMethods_Void.tasks;

import java.util.Scanner;

public class PossitiveNegative {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");

        int number=scan.nextInt();
        System.out.println(number+": "+posNegZero(number));

    }

    public static String posNegZero(int number){

        String result=(number>0)?"Possitive Number":(number<0)?"Negative Number":"Zero";

        return result;

    }
}
