package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5,6,};
        int[] arr2={7,8,9,10};
        int[] newArr=merge(arr1,arr2);
        System.out.println(Arrays.toString(newArr));

    }

    public static int[] merge(int[] arr1,int[] arr2){

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
}
