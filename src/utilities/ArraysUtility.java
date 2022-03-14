package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }


    // prints each decimal of a double array in separate lines
    public static void printEachElement(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }


    // prints each character of char array in separate lines
    public static void printEachElement(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }


    // prints each string of String array in separate lines
    public static void printEachElement(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }
    
    
    // returns the maximum number from integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }


    // returns the maximum number from integer array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }


    // returns the minimum number from integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    // returns the minimum number from double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    // checks if the given integer is contained in the given array, returns boolean
    public static boolean contains(int[] array, int element){
        
        boolean result=false;
        for (int each : array) {
            if (each==element) {
                result = true;
            }           
        }
        return result;
    }


    // checks if the given double is contained in the given array, returns boolean
    public static boolean contains(double[] array, double element){

        boolean result=false;
        for (double each : array) {
            if (each==element) {
                result = true;
            }
        }
        return result;
    }


    // checks if the given char is contained in the given array, returns boolean
    public static boolean contains(char[] array, char element){

        boolean result=false;
        for (char each : array) {
            if (each==element) {
                result = true;
            }
        }
        return result;
    }


    // checks if the given String is contained in the given array, returns boolean
    public static boolean contains(String[] array, String element){

        boolean result=false;
        for (String each : array) {
            if (each.equalsIgnoreCase(element)) {
                result = true;
            }
        }
        return result;
    }


    // merge two given integer arrays and return a new int array
    public static int[] mergeTwoArrays(int[] arr1,int[] arr2){

        int[] result=new int[arr1.length+arr2.length];

        for (int i = 0; i < result.length; i++) {
            if (i<arr1.length) {
                result[i] = arr1[i];
            }else{
                result[i]=arr2[i-arr1.length];
            }
        }
        return result;
    }

    
    // merge two given String array and return a new String array
    public static String[] mergeTwoArrays(String[] arr1,String[] arr2){

        String[] result=new String[arr1.length+arr2.length];

        for (int i = 0; i < result.length; i++) {
            if (i<arr1.length) {
                result[i] = arr1[i];
            }else{
                result[i]=arr2[i-arr1.length];
            }
        }
        return result;
    }
    
    
    // merge two given double arrays and return a new double array
    public static double[] mergeTwoArrays(double[] arr1,double[] arr2){

        double[] result=new double[arr1.length+arr2.length];

        for (int i = 0; i < result.length; i++) {
            if (i<arr1.length) {
                result[i] = arr1[i];
            }else{
                result[i]=arr2[i-arr1.length];
            }
        }
        return result;
    }
    
    
    // merge two given char arrays and return a new char array
    public static char[] mergeTwoArrays(char[] arr1,char[] arr2){

        char[] result=new char[arr1.length+arr2.length];

        for (int i = 0; i < result.length; i++) {
            if (i<arr1.length) {
                result[i] = arr1[i];
            }else{
                result[i]=arr2[i-arr1.length];
            }
        }
        return result;
    }


    //add to given integer Element into the given int array, returns a new int array
    public static int[] addElement(int[] arr,int element){

        int[] newArray=new int[arr.length+1];

        int i =0;
        for (int each : arr) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }


    //add to given double Element into the given double array, returns a new double array
    public static double[] addElement(double[] arr1,double element){

        double[] newArray=new double[arr1.length+1];

        int i =0;
        for (double each : arr1) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }


    //add to given char Element into the given char array, returns a new char array
    public static char[] addElement(char[] arr,char element){

        char[] newArray=new char[arr.length+1];

        int i =0;
        for (char each : arr) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }


    //add to given String Element into the given String array, returns a new String array
    public static String[] addElement(String[] arr,String element){

        String[] newArray=new String[arr.length+1];

        int i =0;
        for (String each : arr) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }


    //removeElements

    //reverse

    //frequencyOfElement

    //uniqueElement

    //removeDuplicates


    
}
