package day12_Scanner.tasks;

import java.util.Scanner;

public class LivingTogether {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("How many people you live with:");
        int num1=input.nextInt();

        if (num1<3){
            System.out.println("Live with less than 3 people");
        }else if (num1>=3&&num1<=6){
            System.out.println("Live with 3 - 6 people");
        }else{
            System.out.println("Live with more than 6 people");
        }



        input.close();
    }
}
