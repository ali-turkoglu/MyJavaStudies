package day53_FunctionalInterface;

import java.util.function.BiPredicate;

public class BuildInFunctionalInterface2 {

    public static void main(String[] args) {

        //Create a function that can check if the Integer is contained in an array of integer, return boolean

        BiPredicate<int[],Integer> isContain= (a,n) -> {
            for (int each : a) {
                if (each==n){
                    return true;
                }
            }
            return false;
        };

        int[] arr={1,2,3,4,5,6,3};
        boolean r1=isContain.test(arr,14);
        System.out.println(r1);

        System.out.println("--------------------------------------------------------------------------");





    }

}
