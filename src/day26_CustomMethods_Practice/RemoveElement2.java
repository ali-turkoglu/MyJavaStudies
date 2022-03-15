package day26_CustomMethods_Practice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement2 {

    public static void main(String[] args) {

        int[] numbers={1,1,1,2,3,3,3,3,1,1,5,6,7,9};
        System.out.println(Arrays.toString(removeElement(numbers,3)));
    }

    // removes the given index from the array and return the new array
    public static int[] removeElement(int[] array,int index){

        if (index<0|| index>array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        int[] result={};

        for (int i = 0; i < array.length; i++) {
            if(!(i==index)){
                result= ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
    }
}
