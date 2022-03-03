package day21_ArrayUtility_ForEachLoop.tasks;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] arr={5,6,1,0,9,8};

        int[] arr2= Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] descendingArr=new int[arr.length];
        for (int i = arr2.length - 1,j=0; i >= 0; i--,j++) {
            descendingArr[j]=arr2[i];
        }
        System.out.println(Arrays.toString(descendingArr));
    }
}
/*Write a program that sort the array of integer in descending order

 */