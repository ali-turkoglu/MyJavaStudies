package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int[] array={2,3,6,4,5};                        //9
        double[] array2={12.3,54.61,54.6};              //4.4
        char[] array3={'a','b','c','d'};                //z
        String[] names={"Ali","Veli","Smith","John"};   // Dolores

        array=addElement(array,9);
        System.out.println(Arrays.toString(array));

        array3=addElement(array3,'z');
        System.out.println(Arrays.toString(array3));

        names=addElement(names,"Dolores");
        System.out.println(Arrays.toString(names));

        array2=addElement(array2,4.4);
        System.out.println(Arrays.toString(array2));


    }

    public static int[] addElement(int[] arr,int element){

        int[] newArray=new int[arr.length+1];

        int i =0;
        for (int each : arr) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }

    public static double[] addElement(double[] arr1,double element){

        double[] newArray=new double[arr1.length+1];

        int i =0;
        for (double each : arr1) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }

    public static char[] addElement(char[] arr,char element){

        char[] newArray=new char[arr.length+1];

        int i =0;
        for (char each : arr) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }

    public static String[] addElement(String[] arr,String element){

        String[] newArray=new String[arr.length+1];

        int i =0;
        for (String each : arr) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }


}
