package day27_WrapperClasses.tasks;

import java.util.Arrays;

public class SwapElements {

    public static void main(String[] args) {

        int[] arr={10,20,30,40,50};
        System.out.println(Arrays.toString(arr));
        arr=swapElement(arr,2,5);
        System.out.println(Arrays.toString(arr));

    }

    // swap the given elements to the given indexes of array, returns new array
    public static int[] swapElement(int[] array,int index1,int index2){

        if (index1<0||index2<0||index1>=array.length||index2>=array.length){
            System.err.println("Invalid index: "+index1+" - "+index2);
            System.exit(0);
        }

        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
        return array;
    }


    // swap the given elements to the given indexes of array, returns new array
    public static double[] swap(double[] array, int i, int j){
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }


    // swap the given elements to the given indexes of array, returns new array
    public static char[] swap(char[] array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }


    // swap the given elements to the given indexes of array, returns new array
    public static String[] swap(String[] array, int i, int j){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }


}
/*Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j.
	the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array



 */