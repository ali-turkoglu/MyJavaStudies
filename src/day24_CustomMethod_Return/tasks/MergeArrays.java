package day24_CustomMethod_Return.tasks;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

       int[] arr1 = {1,2,3};
       int[] arr2 = {4,5,6};

       int[] newArray=mergeArrays(arr1,arr2);
        System.out.println("New Array="+Arrays.toString(newArray));
    }

    public static int[] mergeArrays(int[] arr1,int[] arr2){

        int[] newArr= Arrays.copyOf(arr1,arr1.length+arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length+i]=arr2[i];
        }
        return newArr;
    }
}
/*Create a method named merge that passes two integer array parameters,
the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}

 */