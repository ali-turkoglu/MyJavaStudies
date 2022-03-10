package day24_CustomMethod_Return.tasks;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers={1,2,3,4,5,6,7,8,9,10};

        int[] reverseNumbers=reverseArray(numbers);
        System.out.println(Arrays.toString(reverseNumbers));

    }

    public static int[] reverseArray(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
/*create a method that return the reversed array
					{1,2,3,4,5} === > {5,4,3,2,1}



 */