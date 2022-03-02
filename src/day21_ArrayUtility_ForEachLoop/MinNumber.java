package day21_ArrayUtility_ForEachLoop;

public class MinNumber {
    public static void main(String[] args) {
        int[] numbers={10,5,4,20,1,0};
        int min = numbers[0];

        for (int each:numbers) {

            if (each < min){
                min=each;
            }

        }
        System.out.println(min);
    }
}
