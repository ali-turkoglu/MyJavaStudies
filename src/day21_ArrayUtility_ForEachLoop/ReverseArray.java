package day21_ArrayUtility_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

          int[] numbers={10,20,30,40,50};

          int[] reversed=new int[numbers.length];

          for (int i=numbers.length-1,j=0;i>=0;i--,j++){
               reversed[i]=numbers[j];
          }
          System.out.println(Arrays.toString(numbers));
          System.out.println(Arrays.toString(reversed));
    }
}
