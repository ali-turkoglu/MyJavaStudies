package day26_CustomMethods_Practice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] numbers={1,1,1,2,2,3,3,3,3,1,1,5,6,7,9};
        System.out.println(Arrays.toString(uniqueElements(numbers)));

        int[] array={2,3,6,4,5};                        //9
        double[] array2={12.3,12.3,54.61,54.6};              //4.4
        char[] array3={'a','b','c','d'};                //z
        String[] names={"Ali","Veli","Ali","Smith","Smith","John"};   // Dolores

        System.out.println(Arrays.toString(uniqueElements(array2)));
        System.out.println(Arrays.toString(uniqueElements(names)));



    }

    // returns the unique elements from the given array
    public static int[] uniqueElements(int[] array){

        int[] result={};
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // returns the unique elements from the given array
    public static double[] uniqueElements(double[] array){

        double[] result={};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){ //if the frequency is 1, it is unique
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // returns the unique elements from the given array
    public static char[] uniqueElements(char[] array){

        char[] result={};
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // returns the unique elements from the given array
    public static String[] uniqueElements(String[] array){

        String[] result={};
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

}
