package test;

import java.util.Scanner;

public class Armstrong {

    // Write a method that can check if a number is Armstrong number
    //153,370,371,407 .....
    //1634, 8208, 9474
    //54748, 92727, 93084
    //548834
    //1741725, 4210818, 9800817, 9926315

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number to check if it is Armstrong:");
        isArmstrong(scan.nextInt());

    }

    public static boolean isArmstrong(int number) {

        boolean isArmstrong = false;

        String[] split = (number + "").split("");


        int finalResult=0;

        for (String s : split) {
            int power=split.length;
            int result = 1;
            while (power!=0){

                result= result*Integer.parseInt(s);
                power--;
                //System.out.println("while result = " + result);

            }
            finalResult+=result;
            //System.out.println("finalResult = " + finalResult);

        }
        //System.out.println("result " + result);

        if (finalResult == number) {
            isArmstrong = true;
            System.out.println(number + " is Armstrong Number");
        } else {
            System.out.println(number + " is not Armstrong Number");
        }

        return isArmstrong;

    }


}
