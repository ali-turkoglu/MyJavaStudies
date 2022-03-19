package test;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        int [] arr={1,2,3,2,5,2,6,2,9,2,7};
        System.out.println(Arrays.toString(replaceAll1(arr,2,20)));
        System.out.println(Arrays.toString(replaceAll2(arr,2,20)));


    }
    public static int[] replaceAll1(int[] array,int oldValue,int newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }


    public static int[] replaceAll2(int[] array,int oldValue,int newValue){

        for (int each : array) {
            if (each==oldValue){
                each=newValue;
            }
        }
        return array;
    }

}


/*

We'll say that a "triple" in a string is a char appearing three times in a row.
Print out the number of triples in the given string. The triples may overlap.

 */