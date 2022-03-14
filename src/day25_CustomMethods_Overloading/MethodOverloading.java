package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {


        int[] intArray={1,2,3,4,5,6};
        Arrays.sort(intArray);      // sort methodu hepsi için kullanılıyor. aynı fonksiyon aynı isim farklı parameter

        double[] doubleArray={1.2,2.3,3.4,};
        Arrays.sort(doubleArray);

        char[] charArray={'a','b','c','d'};
        Arrays.sort(charArray);

        System.out.println("------------------------------------------------------------------");

        sumOfNumbers(10,20,30);

        sumOfNumbers(10.7,2.8);

        sumOfNumbers(12.3,34.4,5.5,87.7);

        sumOfNumbers(12,23,34,56);
        System.out.println(sumOfNumbers(1,2,3,4));

    }

    public static int sumOfNumbers(int num1,int num2){

        //int sum=num1+num2;
        return num1+num2;
    }

    public static double sumOfNumbers(double num1,double num2){

        return num1+num2;
    }

    public static int sumOfNumbers(int num1,int num2,int num3){

        return num1+num2+num3;
    }

    public static double sumOfNumbers(double num1,double num2,double num3){

        return num1+num2+num3;
    }

    public static int sumOfNumbers(int num1,int num2,int num3,int num4){

        //return num1+num2+num3+num4;
        return sumOfNumbers(num1,num2)+sumOfNumbers(num3,num4);
    }

    public static double sumOfNumbers(double num1,double num2,double num3,double num4){

        return num1+num2+num3+num4;
    }
}
