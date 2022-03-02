package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] numbers={10,5,9,45,54,73,15};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers); // sort the array in ascending order from small to big

        System.out.println(Arrays.toString(numbers));

    }

}
