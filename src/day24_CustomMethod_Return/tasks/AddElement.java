package day24_CustomMethod_Return.tasks;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {

        int[] arr ={1,2,3};
        int num = 4;
        int[] newArray=addElement(arr,num);
        System.out.println(" New array = " + Arrays.toString(newArray));
    }

    public static int[] addElement(int[]arr,int num){

        int[] newArr=Arrays.copyOf(arr,arr.length+1);
        newArr[arr.length]=num;
        return newArr;
    }
}
/* create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}


 */