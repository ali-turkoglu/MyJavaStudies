package test;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        String str = "Hello World";

        //System.out.println(str.charAt(3));
        //String[] strArr = str.split("");

        //System.out.println("strArr = " + Arrays.toString(strArr));

        // for (String each : strArr) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.toUpperCase().charAt(i);
        }

        System.out.println("result = " + result);



    }
}
