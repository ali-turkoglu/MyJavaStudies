package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {


        int[] array1={1,2,3,4,5,6,7};
        ArraysUtility.printEachElement(array1);

        System.out.println("----------------------------------------------------");

        double [] array2={2.3,4.5,65.4,22.3};
        ArraysUtility.printEachElement(array2);

        System.out.println("-----------------------------------------------------");

        String[] names={"java","python","c#"};
        ArraysUtility.printEachElement(names);

        System.out.println("------------------------------------------------------");

        char[] ch={'c','b','d'};
        ArraysUtility.printEachElement(ch);

        System.out.println("------------------------------------------------------");

        int[] arr={11,22,13,24,15,46,27};
        int max=ArraysUtility.max(arr);
        System.out.println(max);

        System.out.println("------------------------------------------------");

        double [] arr2={2.3,4.5,65.4,22.3};
        double max2=ArraysUtility.max(arr2);
        System.out.println(max2);

        System.out.println("---------------------------------------------------");

        int min=ArraysUtility.min(arr);
        System.out.println(min);

        System.out.println("----------------------------------------------------");

        double min2=ArraysUtility.min(arr2);
        System.out.println(min2);

        System.out.println("--------------------------------------------------");

        int num=9;
        boolean result1=ArraysUtility.contains(arr,num);
        System.out.println(result1);

        System.out.println("-----------------------------------------------------");

        boolean result2=ArraysUtility.contains(arr2,4.5);
        System.out.println(result2);

        System.out.println("----------------------------------------------------");

        boolean result3=ArraysUtility.contains(names,"java");
        System.out.println(result3);

        System.out.println("----------------------------------------------------");

        boolean result4=ArraysUtility.contains(ch,'z');
        System.out.println(result4);





    }
}
