package week03;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // find if an given integer is even or odd number

        Scanner input = new Scanner(System.in);
        System.out.println("Please give a number:");
        int a= input.nextInt();
        if(a%2==0){
            System.out.println(a+" is even number.");
        }else{
            System.out.println(a+" is odd number.");
        }

    }
}
