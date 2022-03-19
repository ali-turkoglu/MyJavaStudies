package week10;

public class CountOfEven {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,8};
        System.out.println(countOfEven(arr));

    }

    public static int countOfEven(int [] array){

        int count=0;

        for (int each : array) {
            if (each%2==0){
                count++;
            }
        }
        return count;

    }
}
