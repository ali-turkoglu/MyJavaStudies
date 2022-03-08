package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArray2 {

    public static void main(String[] args) {

        int[][][] arr3D={ { {1,2,3},{4,5,6},{7,8,9} } , { {10,20,30}, {40,50,60,70},{80,90}} };

        System.out.println(Arrays.deepToString(arr3D));    // [[[1, 2, 3], [4, 5, 6], [7, 8, 9]], [[10, 20, 30], [40, 50, 60, 70], [80, 90]]]

        System.out.println(Arrays.deepToString(arr3D[1])); // [[10, 20, 30], [40, 50, 60, 70], [80, 90]]

        System.out.println(Arrays.toString(arr3D[0][1]));  // [4, 5, 6]

        System.out.println(arr3D[1][1][2]);  // 60

        for (int[][] each2D : arr3D) {
            for (int[] each1D : each2D) {
                for (int eachElement : each1D) {
                    System.out.print(eachElement+" ");  //  1 2 3 4 5 6 7 8 9 10 20 30 40 50 60 70 80 90
                }
            }
        }
    }
}
