package week09;

import java.util.Arrays;

public class BinarySearch { //

    public static void main(String[] args) {

        int[] nums={-5,23,123,654,2344,12345,14421};    // 25: 0, 1, 2, -(2+1)=-3

        int indexOne =Arrays.binarySearch(nums,23);   //this statement returns index of 23

        System.out.println("indexOne = " + indexOne);       // 1

        System.out.println(Arrays.binarySearch(nums,2344));      // 4

        System.out.println(Arrays.binarySearch(nums,25));       //  -3 if it exist it could be index 3

        if (Arrays.binarySearch(nums,12345)>=0){
            System.out.println("12345 is present in array");
        } else {
            System.out.println("12345 is not in the list");
        }
    }


}
