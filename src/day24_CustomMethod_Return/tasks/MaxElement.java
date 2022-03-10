package day24_CustomMethod_Return.tasks;

public class MaxElement {

    public static void main(String[] args) {

        int [] arr={2,6,9,1,32,54,32,66,74,41};

        int maxNumber=maxElement(arr);
        System.out.println(maxNumber);

    }

    public static int maxElement(int[] arr){

        int maxElement=arr[0];
        for (int each : arr) {
            if (each>maxElement){
                maxElement=each;
            }
        }
        return maxElement;
    }
}
/*create a method that can return the maximum number from an array of integers

 */