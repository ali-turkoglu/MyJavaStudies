package utilities;

import java.util.Arrays;

public class StringUtility {


    // prints separate lines each character of the given string
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }


    // reverses the given string and returns the reversed String
    public static String reverse(String str) {

        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }


    // checks if the given String is palindrome, returns boolean
    public static boolean isPalindrome(String str){

        return str.equalsIgnoreCase(reverse(str));
    }


    // check if the given string is anagram, returns boolean
    public static boolean isAnagram(String str1,String str2){ // "abc"  "bca"
        char [] ch1=str1.toCharArray();
        char [] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);

    }


    // remove the duplicates from given string, return String "aaaabbbbbcccccc"-----> "abc"
    public static String removeDuplicate(String str){

        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (!(result.contains(""+str.charAt(i)))){
                result+=str.charAt(i);
            }
        }
        return result;
    }


    //


}
