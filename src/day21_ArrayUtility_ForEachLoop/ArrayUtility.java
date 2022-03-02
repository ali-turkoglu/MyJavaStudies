package day21_ArrayUtility_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {

        int[] nums={1,2,3,4,5,6,};

        System.out.println(Arrays.toString(nums)); //   "{1,2,3,4,5,6,}"

        System.out.println( nums[3]);

        System.out.println("-------------------------------------------------------");

        int[] scores={96,68,65,78,59,85};

        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));

        System.out.println("Min number is "+scores[0]);
        System.out.println("Max number is "+scores[scores.length-1]);

        String [] names={"Zuhal","Anna","Ahmet","Maria","Sinem","Gunay"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] words={"Anna","ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------------------------------");

        int[] arr1={1,2,3};
        int[] arr2={2,1,3};

        boolean r1 =Arrays.equals(arr1,arr2);
        System.out.println(r1);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2=Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("----------------------------------------------------");

        char[] ch1={'a','b','c'};
        char[] ch2={'c','a','b'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println((Arrays.equals(ch1,ch2))?"ch1 and ch2 are anagrams":"ch1 and ch2 are not anagrams");
        /*if (Arrays.equals(ch1,ch2)){
            System.out.println("ch1 and ch2 are anagrams");
        }else{
            System.out.println("ch1 and ch2 are not anagrams");
        }*/


        System.out.println("-------------------------------------------------------");



    }
}
