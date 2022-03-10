package day23_CustomMethods_Void.tasks;

public class PrintEachElement {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,10,20,30};

        printArray(arr);
    }

    public static void printArray(int[] arr){

        for (int each : arr) {
            System.out.print(each+" ");
        }
    }
}
/*create a method named printEachElement that can print each elements of an integer array

 */