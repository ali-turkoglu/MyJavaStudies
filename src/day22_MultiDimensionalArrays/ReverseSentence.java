package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence="Today is a good day to learn Java";

        String[] arr=sentence.split(" ");

        System.out.println(Arrays.toString(arr));
        String reverseArr="";

        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArr+=arr[i]+" ";
        }
        System.out.println(reverseArr);
    }
}
