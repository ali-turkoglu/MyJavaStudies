package day53_FunctionalInterface;

import java.time.format.SignStyle;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
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


        // create a function that can check if two strings are anagram

        BiPredicate<String ,String > isAnagram= (a,b) -> {
            String [] arr1=a.split("");
            String [] arr2=b.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1,arr2)){
                return true;
            }
            return false;
        };

        boolean r2=isAnagram.test("java","ajav");
        System.out.println(r2);

        System.out.println("============   BiConsumer  ============================");

        BiConsumer<String ,Integer> printStringGivenTimes=(s,n) ->{
            for (int i = 0; i < n ; i++) {
                System.out.println(s);
            }
        };

        printStringGivenTimes.accept("Java",6);

        System.out.println("===================  BiFunction =========================");

        //two integer and returns max number
        BiFunction<Integer,Integer,Integer> maxNum=(a,b)-> (a<b)?b:a;

        System.out.println(maxNum.apply(39,23));

        System.out.println("---------------------------------------------");

       // create a function that can merge two integer arrays sinto a list

        BiFunction<int[],int[],List<Integer>> merge=(a,b) -> {
            List<Integer> result=new ArrayList<>();
            for (int each : a) result.add(each);
            for (int each : b) result.add(each);
            return result;
        };

        int[] arr1={1,2,3,5};
        int[] arr2={2,3,5,9,1,2,3,5};
        System.out.println(merge.apply(arr1, arr2));

        System.out.println("---------------------------------------------");

        // 3. create a function that takes a  list of String and a list of Integer and merge them into a map
        //        /*
        //        names ==> {"Josh", "Daniel"}
        //        score ==> {100, 110}
        //        map ==> {Josh=100, Daniel=110}
        //         */

        BiFunction<List<String > , List<Integer>, Map<String ,Integer>> merge2=(a,b) -> {
            Map<String ,Integer> map=new HashMap<>();
            for (int i = 0; i < a.size(); i++) {
                map.put(a.get(i),b.get(i) );
            }
            return map;
        };
        List<String> names = new ArrayList<>(Arrays.asList("Layan", "Kseniia", "Aygun"));

        List<Integer> scores = new ArrayList<>(Arrays.asList(90, 95, 98));
        System.out.println(merge2.apply(names, scores));




    }

}
