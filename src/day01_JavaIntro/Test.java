package day01_JavaIntro;

import day24_CustomMethod_Return.ReturnMethodIntro;
import day24_CustomMethod_Return.ReturnMethodPractice4;

public class Test {
    public static void main(String[] args) {

        String str="aaaaaaabbbbbbcccccc";

        str= ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);

        String name="Java";
        String reverseName=ReturnMethodIntro.reverse(name);
        System.out.println(reverseName);



    }
}
