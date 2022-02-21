package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        
        double sum= 0;
        //1+2  +3 .....

        for (int i = 1; i <101 ; i++) {     // i: 1,2,3,4,5.....100
        sum +=i;
        }
        System.out.println(sum);  // 5050.0
        System.out.println();

        System.out.println("____________________________________________________");

        int total=0;
        Scanner input=new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

        System.out.println("Enter a number");
        total+=input.nextInt();
    }
        System.out.println(total);

input.close();

   }
}
