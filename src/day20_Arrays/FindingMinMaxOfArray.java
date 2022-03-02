package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindingMinMaxOfArray {
    public static void main(String[] args) {

        int[] numbers=new int[10];

        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i]=scan.nextInt();      //each user entered input will be assigned to the indexes of the array
                                            // numbers

        }
        System.out.println(Arrays.toString(numbers));

        int max=numbers[0];
        int min=numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]>max){
                max=numbers[i];
            }
            if (numbers[i]<min){
                min=numbers[i];
            }


        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);


    }
}
