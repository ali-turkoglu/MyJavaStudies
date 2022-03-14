package day24_CustomMethod_Return.tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60};
        int index = 2;
        int[] newArray=removeElement(array,index);
        System.out.println("New array= "+ Arrays.toString(newArray));
    }

    public static int[] removeElement(int[] arr, int indexNo){

        int[] newArr=new int[arr.length-1];
        for (int i = 0,j=0; i < arr.length; i++) {
            if (i==indexNo){
                continue;
            }
            newArr[j]=arr[i];
            j++;
        }
        return newArr;
    }
}
/*create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}


 */