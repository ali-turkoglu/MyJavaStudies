package day21_ArrayUtility_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] num1={1,2,3,4,5};
        int[] num2={6,7,8};
        int[] num3=new int[num1.length+num2.length];

      int i=0;
        for (int each : num1) {
            num3[i++]=each;
        }
        for (int each : num2) {
            num3[i++] = each;
        }

        System.out.println(Arrays.toString(num3));
    }
}
