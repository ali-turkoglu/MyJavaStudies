package day27_WrapperClasses.tasks;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        arr=replace(arr,6,33);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] replace(int[] array,int index,int newElement){

        if (index>array.length-1||index<0){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }


}
/*1.1 Create a method named replace that passes three parameters:
 integer array, integer index, integer newElement.
 The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}



 */