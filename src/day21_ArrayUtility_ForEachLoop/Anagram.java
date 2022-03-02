package day21_ArrayUtility_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1="acdb"; // find it is anagram or not
        String str2="dbca";

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch2,ch1)){
            System.out.println(Arrays.toString(ch1)+" and "+Arrays.toString(ch2) +" are anagram");
        }else{
            System.out.println(Arrays.toString(ch1)+" and "+Arrays.toString(ch2) +" are not anagram");
        }

    }
}
