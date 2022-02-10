package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter true or false");

        boolean result=input.nextBoolean(); // sadece true / false kabul eder

        String name=input.next();           // sadece space tuşuna kadar yazılan harfler kabul edilir


        System.out.println("name = " + name);

        input.close();

    }
}
