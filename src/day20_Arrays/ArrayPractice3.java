package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers would you like the enter?");
        int length=scan.nextInt(); //10

        if (length<=0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        int[] numbers =new int[length];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number "+i+": ");
            numbers[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(numbers));

        scan.close();
    }
}
