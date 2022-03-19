package day27_WrapperClasses.tasks;

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {

        int[] arr={10,20,30,40,50};
        System.out.println(Arrays.toString(arr));
        arr=insert(arr,2,444);
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------------------------------------------------");

        String [] str ={"ankara","izmir","istanbul","mersin"};
        System.out.println(Arrays.toString(str));
        str=insert(str,1,"kars");
        System.out.println(Arrays.toString(str));

    }

    // insert the given newElement to the given index of the array and returns the new array
    public static int[] insert(int[] array,int index, int newElement){
        if (index>array.length-1||index<0){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        int[] result=new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            if (i==index){
                result [i]=newElement;
                result[i+1]=array[i];
            }else if(i<index){
                result[i]=array[i];
            }else{
                result[i+1]=array[i];
            }
        }
        return result;
    }


    // insert the given newElement to the given index of the array and returns the new array
    public static double[] insert(double[] array, int index, double element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }


    // insert the given newElement to the given index of the array and returns the new array
    public static char[] insert(char[] array, int index, char element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }


    // insert the given newElement to the given index of the array and returns the new array
    public static String[] insert(String[] array, int index, String element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }





}
/*1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array

 */