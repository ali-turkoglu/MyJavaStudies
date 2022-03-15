package day26_CustomMethods_Practice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(reverse(numbers)));

        String[] names={"Ali","Veli","Smith","Smith","John"};
        System.out.println(Arrays.toString(reverse(names)));

        double[] array2={12.3,12.3,54.61,54.6};
        System.out.println(Arrays.toString(reverse(array2)));



        char[] array3={'a','b','c','d'};
        System.out.println(Arrays.toString(reverse(array3)));


    }

    // reverse the given array and returns the new array
    public static int[] reverse(int[] array){

        int[] result=new int[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--) {
            result[j++]=array[i];
        }
        return result;
    }


    // reverse the given array and returns the new array
    public static String[] reverse(String[] array){

        String[] result={};
        for (int i = array.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }


    // reverse the given array and returns the new array
    public static double[] reverse(double[] array){

        double[] result=new double[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--) {
            result[j++]=array[i];
        }
        return result;
    }


    // reverse the given array and returns the new array
    public static char[] reverse(char[] array){

        char[] result=new char[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--) {
            result[j++]=array[i];
        }
        return result;
    }



}
