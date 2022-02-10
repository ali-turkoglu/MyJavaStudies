package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your full name:");        //Wooden Spoon Enter
        String fullName=input.nextLine();

        System.out.println("Enter your Programming Language:"); // Java Programming Language
        String program=input.nextLine();

        System.out.println("Enter your age");
        int age=input.nextInt();        //1234Enter --------> en son input da enter assign edilmiş olur

        input.nextLine();
        System.out.println("Enter your school name:");
        String schoolName=input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("program = " + program);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();

    }
}
