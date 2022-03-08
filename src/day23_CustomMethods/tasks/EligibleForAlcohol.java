package day23_CustomMethods.tasks;

import java.util.Scanner;

public class EligibleForAlcohol {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age:");
        eligibleForAlcohol(scan.nextInt());
    }


    public static void eligibleForAlcohol(int alcoholAge){
        if(alcoholAge>=19){
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("You are not eligible to buy alchol");
        }
    }

}
