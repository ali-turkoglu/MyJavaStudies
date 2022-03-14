package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str="Java";
        StringUtility.printEachChar(str);

        System.out.println("-----------------------------------------");


        System.out.println(StringUtility.reverse(str));

        System.out.println("--------------------------------------------");

        String str2="level";
        System.out.println(str2+" is palindrome: "+StringUtility.isPalindrome(str2));

        String[] names={"Ali","Veli","Smith","John"};

        for (String each : names) {
            System.out.println(each+" is palindrome: "+StringUtility.isPalindrome(each));
        }

        System.out.println("-------------------------------------------------------------");

        String word1="abc";
        String word2="cba";
        System.out.println(word1+" and "+word2+" are anagram: "+StringUtility.isAnagram(word1,word2));

        System.out.println("--------------------------------------------------------------------");

        String word3="aaaaabbbbbbbcccccdeeeeeff";
        System.out.println(StringUtility.removeDuplicate(word3));

    }


}
