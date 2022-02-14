package day13_String.tasks;

import java.util.Scanner;

public class LastThreeChar {
    public static void main(String[] args) {

        System.out.println("Enter something:");
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();

        int length=str.length();
        char ch1=str.charAt(length-3);
        char ch2=str.charAt(length-2);
        char ch3=str.charAt(length-1);
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch3 = " + ch3);

        System.out.println(""+ch1+ch2+ch3);





    }
}
