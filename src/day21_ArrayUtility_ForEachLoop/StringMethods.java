package day21_ArrayUtility_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {


        // toCharArray()
        String str="Java";

        char[] ch=str.toCharArray();
        System.out.println(Arrays.toString(ch));
        for (char each : ch) {
            System.out.println(each);
        }

        System.out.println("---------------------------------------------------");

        // split()

        String a="I love learning java programming language";
        String[] b=a.split(" ");
        System.out.println(Arrays.toString(b));

        String email="woodenspoon@gmail.com";
        String[] arr =email.split("@");
        System.out.println(Arrays.toString(arr));






    }
}
