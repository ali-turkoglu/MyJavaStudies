package week10;

public class DifferenceOfMaxMin {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8};
        System.out.println(differenceOfMaxAndMin(arr));

        System.out.println(CountOfEven.countOfEven(arr));

    }

    public static int differenceOfMaxAndMin(int[] array){

        int max=array[0];
        int min=array[0];
        max=Integer.MIN_VALUE; // same ----> int max=array[0]  minumum int sayısını atar.

        for (int each : array) {
            if (each>max){
                max=each;
            }
            if (each<min){
                min=each;
            }
        }
        return max-min;
    }
}
