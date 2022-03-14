package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        int[] array={2,3,6,4,5};
        array=addInteger(array,6);
        //System.out.println(Arrays.toString(addInteger(array,6)));
        System.out.println(Arrays.toString(array));

        double[] array2={12.3,54.61,54.6};
        System.out.println(Arrays.toString(adddouble(array2,22.4)));

        char[] array3={'a','b','c','d'};
        System.out.println(Arrays.toString(addChar(array3,'e')));


        String[] names={"Ali","Veli","Smith","John"};
        names=addString(names,"Igor");
        System.out.println(Arrays.toString(names));

    }

    public static int[] addInteger(int[] arr,int element){

        int[] newArray=new int[arr.length+1];

        int i =0;
        for (int each : arr) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }

    public static double[] adddouble(double[] arr1,double element){

        double[] newArray=new double[arr1.length+1];

        int i =0;
        for (double each : arr1) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }

    public static char[] addChar(char[] arr,char element){

        char[] newArray=new char[arr.length+1];

        int i =0;
        for (char each : arr) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }

    public static String[] addString(String[] arr,String element){

        String[] newArray=new String[arr.length+1];

        int i =0;
        for (String each : arr) {
            newArray[i++]=each;
        }
        newArray[i]=element;
        return newArray;
    }
}
/*create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array


 */