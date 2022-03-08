package day22_MultiDimensionalArrays.tasks;

import java.util.Arrays;

public class Reverse2dArray {

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        int[][] newArr2D = new int[arr2D.length][];

        for (int i = 0; i < arr2D.length; i++) {
            int[] temp = new int[arr2D[i].length];

            for (int j = 0; j < arr2D[i].length; j++) {
                temp[(temp.length - 1) - j] = arr2D[i][j];
            }
            newArr2D[(newArr2D.length - 1) - i] = temp;
        }


//                    arr2D[1]
        /* for (int i = arr2D.length - 1 ,outer=0; i >= 0; i--,outer++) {

             for (int j = arr2D[i].length - 1,inner=0; j >= 0; j--,inner++) {
                newArr2D[outer][inner]=arr2D[i][j];
                //         0      0          1  2    newArr2D={{6,0,0},{0,0,0}}
            }
        }*/
        System.out.println(Arrays.deepToString(newArr2D));


    }
}
/*Write a program that can reverse a two-dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};


 */