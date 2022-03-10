package day24_CustomMethod_Return.tasks;

public class MinElement {

    public static void main(String[] args) {

        int [] arr={2,6,9,1,32,54,32,66,74,41};

        int minNumber=minElement(arr);
        System.out.println(minNumber);


    }

    public static int minElement(int[] arr){

        int minElement=arr[0];
        for (int each : arr) {
            if (each<minElement){
                minElement=each;
            }
        }
        return minElement;
    }
}
/*create a method that can return the minimum number from an array of integers

 */