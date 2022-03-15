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

       /* int[] result=new int[arr1.length+arr2.length];

        for (int i = 0; i < result.length; i++) {
            if (i<arr1.length) {
                result[i] = arr1[i];
            }else{
                result[i]=arr2[i-arr1.length];
            }
        }*/
        int[] result={};
        for (int each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result=ArraysUtility.addElement(result,each);
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


    //adds the given integer Element to the given int array, returns a new int array
    public static int[] addElement(int[] arr,int element){

        int[] newArray=new int[arr.length+1];

        int i =0;
        for (int each : arr) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }


    //adds the given double Element to the given double array, returns a new double array
    public static double[] addElement(double[] arr1,double element){

        double[] newArray=new double[arr1.length+1];

        int i =0;
        for (double each : arr1) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }


    //adds the given char Element to the given char array, returns a new char array
    public static char[] addElement(char[] arr,char element){

        char[] newArray=new char[arr.length+1];

        int i =0;
        for (char each : arr) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }


    //adds the given String Element to the given String array, returns a new String array
    public static String[] addElement(String[] arr,String element){

        String[] newArray=new String[arr.length+1];

        int i =0;
        for (String each : arr) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(int [] array,int element ){

        int count=0;
        for (int each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(double [] array,double element ){

        int count=0;
        for (double each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(char [] array,char element ){

        int count=0;
        for (char each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(String [] array,String element ){

        int count=0;
        for (String each : array) {
            if (each.equals(element)){
                count++;
            }
        }
        return count;
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




    //removeDuplicates


    
}
