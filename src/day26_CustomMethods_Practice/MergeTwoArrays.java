package day26_CustomMethods_Practice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array = {12, 13, 16, 14, 15};

        System.out.println(Arrays.toString(merge1(numbers, array)));
        System.out.println(Arrays.toString(merge2(numbers, array)));
        System.out.println(Arrays.toString(merge3(numbers, array)));

        String[] names={"Ali","Veli","Ali","Smith","Smith","John"};
        String[] names2={"Ankara","van","istanbul","izmir"};
        System.out.println(Arrays.toString(merge2(names,names2)));
    }

    // merge two given integer arrays and return a new int array
    public static int[] merge1(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }


    // merge two given integer arrays and return a new int array
    public static int[] merge2(int[] arr1, int[] arr2) {

        int[] result = {};
        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


    // merge two given integer arrays and return a new int array
    public static int[] merge3(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < result.length; i++) {
            if (i < arr1.length) {
                result[i] = arr1[i];
            } else {
                result[i] = arr2[i - arr1.length];
            }
        }
        return result;
    }



    // merge two given String arrays and return a new String array
    public static String[] merge2(String[] arr1, String[] arr2) {

        String[] result = {};
        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
}
