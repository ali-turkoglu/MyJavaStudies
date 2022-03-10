package day24_CustomMethod_Return.tasks;

import java.util.Arrays;

public class MergeTwoArray {

    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        int [] arr2={2,6,9,1,32,54,32,66,74,41};

        int [] mergeArrs=mergeArrays(arr1,arr2);
        System.out.println(Arrays.toString(mergeArrs));

    }

    public static int[] mergeArrays(int[] arr1,int[] arr2){

        int [] mergeArrs=new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            mergeArrs[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            mergeArrs[arr1.length+i]=arr2[i];
        }
        return mergeArrs;
    }
}
/*create a method that can merge two arrays and returnj the new array
				arr1 = {1,2,3}
				arr2 = {4,5}

				{1,2,3,4,5}


 */