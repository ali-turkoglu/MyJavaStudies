package day20_Arrays.tasks;

import java.util.Arrays;

public class MovingElements {
    public static void main(String[] args) {

        int[] arr= {0, 0, 5, 0, 1, 8};
        int[] arr2=new int[arr.length];

        int j=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                arr2[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2));

    }
}
/*write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */