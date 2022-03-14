package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {

        int[] num1={1,2,3,4,5,6,7};
        int[] num2={11,22,13,24,15,46,27};

        double [] d1={2.3,4.5,65.4,22.3};
        double [] d2={2.3,4.5,65.4,22.3};

        String[] names1={"java","python","c#"};
        String[] names2={"Ahmet","Dolores","Smith","John"};

        char[] ch1={'c','b','d'};
        char[] ch2={'j','v','g','p'};

        System.out.println("____________________________________________________________________");

        int[] mergeNums=ArraysUtility.mergeTwoArrays(num1,num2);
        System.out.println(Arrays.toString(mergeNums));

        String[] mergeNames=ArraysUtility.mergeTwoArrays(names1,names2);
        System.out.println(Arrays.toString(mergeNames));

        char[] mergeCh=ArraysUtility.mergeTwoArrays(ch1,ch2);
        System.out.println(Arrays.toString(mergeCh));

        double[] mergeDouble=ArraysUtility.mergeTwoArrays(d1,d2);
        System.out.println(Arrays.toString(mergeDouble));

        System.out.println("--------------------------------------------------------------------");

        int[] addnumber=ArraysUtility.addElement(num1,333);
        System.out.println(Arrays.toString(addnumber));

        double[] addDouble=ArraysUtility.addElement(d1,6.6);
        System.out.println(Arrays.toString(addDouble));

        char [] addChar=ArraysUtility.addElement(ch1,'k');
        System.out.println(Arrays.toString(addChar));

        String[] addString =ArraysUtility.addElement(names1,"Ankara");
        System.out.println(Arrays.toString(addString));

        System.out.println("------------------------------------------------------------------------");



    }
}
