package day23_CustomMethods_Void.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two words to see anagram or not");
        String str=scan.next();
        String str2=scan.next();

        anagram(str,str2);



    }

    public static void anagram(String str,String str2){

            char[] ch1= str.toLowerCase().toCharArray();
            char[] ch2=str2.toLowerCase().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1,ch2)){
                System.out.println("They are anagram");
            }else{
                System.out.println("They are not anagram");
            }


    }
}
/*create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram


 */