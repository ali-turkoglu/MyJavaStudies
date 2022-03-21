package utilities;

import java.util.ArrayList;
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


    // replace the element of the array at given index with the new element
    public static int[] replace(int[] array,int index,int newElement){

        if (index>array.length||index<0){
            System.err.println("Invalid Index: "+index);;
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }


    // replace the element of the array at given index with the new element
    public static double[] replace(double[] array,int index,double newElement){

        if (index>array.length||index<0){
            System.err.println("Invalid Index: "+index);;
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }


    // replace the element of the array at given index with the new element
    public static char[] replace(char[] array,int index,char newElement){

        if (index>array.length||index<0){
            System.err.println("Invalid Index: "+index);;
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }


    // replace the element of the array at given index with the new element
    public static String[] replace(String[] array,int index,String newElement){

        if (index>array.length||index<0){
            System.err.println("Invalid Index: "+index);;
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }


    // replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array,int oldValue,int newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }


    // replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array,double oldValue,double newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }


    // replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array,String oldValue,String newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){
                array[i]=newValue;
            }
        }
        return array;
    }


    // replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array,char oldValue,char newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }


    // removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int [] result={};

        for (int each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double [] result={};

        for (double each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char [] result={};

        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String [] result={};

        for (String each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // insert the given newElement to the given index of the array and returns the new array
    public static int[] insert(int[] array,int index, int newElement){
        if (index>array.length-1||index<0){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        int[] result=new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            if (i==index){
                result [i]=newElement;
                result[i+1]=array[i];
            }else if(i<index){
                result[i]=array[i];
            }else{
                result[i+1]=array[i];
            }
        }
        return result;
    }


    // insert the given newElement to the given index of the array and returns the new array
    public static double[] insert(double[] array, int index, double element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }


    // insert the given newElement to the given index of the array and returns the new array
    public static char[] insert(char[] array, int index, char element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }


    // insert the given newElement to the given index of the array and returns the new array
    public static String[] insert(String[] array, int index, String element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }


    // swap the given elements to the given indexes of array, returns new array
    public static int[] swap(int[] array,int index1,int index2){

        if (index1<0||index2<0||index1>=array.length||index2>=array.length){
            System.err.println("Invalid index: "+index1+" - "+index2);
            System.exit(0);
        }

        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
        return array;
    }


    // swap the given elements to the given indexes of array, returns new array
    public static double[] swap(double[] array, int i, int j){
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }


    // swap the given elements to the given indexes of array, returns new array
    public static char[] swap(char[] array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }


    // swap the given elements to the given indexes of array, returns new array
    public static String[] swap(String[] array, int i, int j){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }


    // convert array to ArrayList, return Integer ArrayList
    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list=new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }


    // convert array to ArrayList, returns Double ArrayList
    public static ArrayList<Double> convertArrayToArrayList(double[] array){
        ArrayList<Double> list=new ArrayList<>();
        for (double each : array) {
            list.add(each);
        }
        return list;
    }


    // convert array to ArrayList, returns Character ArrayList
    public static ArrayList<Character> convertArrayToArrayList(char[] array){
        ArrayList<Character> list=new ArrayList<>();
        for (char each : array) {
            list.add(each);
        }
        return list;
    }


}
