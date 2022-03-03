package day21_ArrayUtility_ForEachLoop.tasks;

import java.util.Arrays;

public class OddEvenNumbers {
    public static void main(String[] args) {

        int[] numbers={1,2,3,4,5,6,7,8,9,10,11};
        int oddNumbers=0;
        int evenNumbers=0;

        for (int each : numbers) {
            if (each%2==0){
                System.out.println(each+" is even number");
                evenNumbers++;
            }else{
                System.out.println(each+" is odd number");
                oddNumbers++;
            }
        }
        int[] oddArray=new int[oddNumbers];
        int[] evenArray=new int[evenNumbers];
        oddNumbers=0;
        evenNumbers=0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0){
                evenArray[evenNumbers]=numbers[i];
                evenNumbers++;
            }else{
                oddArray[oddNumbers]=numbers[i];
                oddNumbers++;
            }
        }
        System.out.println("odd numbers: "+Arrays.toString(oddArray));
        System.out.println("even numbers: "+Arrays.toString(evenArray));

    }
}
/*
    Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop*/
