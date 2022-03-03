package day20_Arrays.tasks;

import java.util.Arrays;

public class Reverse2 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] reversed=new int[arr.length];

        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            reversed[j]=arr[i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
/*
    Write a program that can reverse an array of integers and returns it as new array
        ex:
        array = {1,2,3,4,5};

        output:
        reversedArray = {5,4,3,2,1};*/
