package day26_CustomMethods_Practice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] numbers={1,1,1,2,2,3,3,3,3,1,1,5,6,7,9};
        System.out.println(Arrays.toString(removeElement(numbers,3)));
        int[] array={2,3,6,4,5};                        //9
        double[] array2={12.3,12.3,54.61,54.6};              //4.4
        char[] array3={'a','b','c','d'};                //z
        String[] names={"Ali","Veli","Ali","Smith","Smith","John"};   // Dolores

        System.out.println(Arrays.toString(removeElement(array2,11)));
        System.out.println(Arrays.toString(removeElement(array3,1)));
        System.out.println(Arrays.toString(removeElement(names,1)));

    }

    // removes the given index from the array and return the new array
    public static int[] removeElement(int[] array,int index){

        if (index<0|| index>array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        int[] result=new int[array.length-1];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if (i==index){
                continue;
            }else{
                result[j++]=array[i];
            }
        }
        return result;
    }


    // removes the given index from the array and return the new array
    public static double[] removeElement(double[] array,int index){

        if (index<0|| index>array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        double[] result=new double [array.length-1];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if (i==index){
                continue;
            }else{
                result[j++]=array[i];
            }
        }
        return result;
    }


    // removes the given index from the array and return the new array
    public static String[] removeElement(String[] array,int index){

        if (index<0|| index>array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        String[] result=new String [array.length-1];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if (i==index){
                continue;
            }else{
                result[j++]=array[i];
            }
        }
        return result;
    }



    // removes the given index from the array and return the new array
    public static char[] removeElement(char[] array,int index){

        if (index<0|| index>array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        char[] result=new char [array.length-1];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if (i==index){
                continue;
            }else{
                result[j++]=array[i];
            }
        }
        return result;
    }

}
