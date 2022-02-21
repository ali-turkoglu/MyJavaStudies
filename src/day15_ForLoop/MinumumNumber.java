package day15_ForLoop;

import java.util.Scanner;

public class MinumumNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int number=0;
        int min=2147483647;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number:");
            number =input.nextInt();

            if (number<min){
                min=number;

            }

        }
        System.out.println("Min number is "+min);

    }
}
