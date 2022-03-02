package day21_ArrayUtility_ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] numbers={10,20,30,40,50,60,70};

        for (int each:numbers ) {  //each: elements of the arrays
            System.out.print(each+" ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {  // i: indexes of the arrays
            int eachNumbers=numbers[i];
            System.out.print(numbers[i]+" ");

        }

    }
}
