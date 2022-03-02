package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        //store the elements: 10,20,50,70
        int[] numbers = {10, 20, 50, 70}; // size is 4

        System.out.println(Arrays.toString(numbers));

        System.out.println("------------------------------------------");

        // create a variable that can contain 5 scores

        int[] scores = new int[5]; // default value is given 0 for each

        scores[1] = 86; // Array second value is 86 now
        scores[scores.length - 1] = 99; // last value is 99 now
        scores[0] = 65;
        scores[2] = 55;
        scores[3] = 75;
        System.out.println(Arrays.toString(scores));

        System.out.println("------------------------------------------------------");


        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        System.out.println("----------------------------------------");


        for (int i =months.length-1; i >=0 ; i--) {
            System.out.println(months[i]);


        }

    }

}

