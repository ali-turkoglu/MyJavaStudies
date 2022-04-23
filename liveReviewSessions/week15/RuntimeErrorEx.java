package week15;

import java.util.Scanner;

public class RuntimeErrorEx {

    public static void main(String[] args) {

        System.out.println("Hello");



        try {
            System.out.println(5/new Scanner(System.in).nextInt());
            // when user puts zero this line will be skipped
        }catch (RuntimeException e){

        }

        System.out.println("How are you today?");
        System.out.println("Some more lines of code");

    }
}
