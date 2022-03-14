package day24_CustomMethod_Return.tasks;

import java.util.Arrays;

public class ContainInArray {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};
        int num = 5;
        boolean isContain=contains(arr,num);
        System.out.println(num+" is in arr[]="+isContain);

    }

    public static boolean contains(int[] arr,int num){

        boolean result=false;

        for (int each : arr) {
            if (each==num){
                result=true;
            }
        }
        return result;
    }
}
/*Create a method named contains that passes one integer array and one integer parameters,
the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false

 */