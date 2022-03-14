package day24_CustomMethod_Return.tasks;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "cba";
        String str2 = "bac";

        boolean isAnagram=anagram(str1,str2);
        System.out.println("Is "+str1+" and "+str2+" anagram: "+isAnagram);

    }

    public static boolean anagram(String str1,String str2){

        boolean result;
        char[] ch=str1.toLowerCase().toCharArray();
        char[] ch2=str2.toLowerCase().toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        if (Arrays.equals(ch,ch2)){
            result=true;
        }else{
            result=false;
        }
        return result;
    }
}
/*create a method named isAnagram that passes two String parameters,
the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true


 */