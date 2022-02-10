package day12_Scanner.tasks;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Miles you want to convert Km");
        double miles= input.nextDouble();

        System.out.println(miles*1.609);


        input.close();

    }
}
