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


    // is given string strong password or not, returns true/false
    public static boolean isStrongPassword(String password){

        boolean r1=password.length()>=8&&!password.contains(" ");
        boolean r2=false;   // has upper case
        boolean r3=false;   //has lower case
        boolean r4=false;   //has special char
        boolean r5=false;   //has digit

        char[] ch=password.toCharArray();

        for (char each : ch) {
            if (Character.isUpperCase(each)){
                r2=true;
            }else if (Character.isLowerCase(each)) {
                r3=true;
            }else  if (!Character.isLetterOrDigit(each)){
                r4=true;
            }else if (Character.isDigit(each)) {
                r5=true;
            }

            if (r2 && r3 && r4 && r5){
                break;
            }
        }

        return r1&&r2&&r3&&r4&&r5;

    }


    // retrieve the letters, digits and special characters from the string and print all
    public static void retrieve(String str){

        String letters="";
        String digits="";
        String specialChars="";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='A'&&str.charAt(i)<='Z'||str.charAt(i)>='a'&&str.charAt(i)<='z'){
                letters+=str.charAt(i);
            }else if (str.charAt(i)>='0'&&str.charAt(i)<='9'){
                digits+=str.charAt(i);
            }else{
                specialChars+=str.charAt(i);
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }


    //


}
