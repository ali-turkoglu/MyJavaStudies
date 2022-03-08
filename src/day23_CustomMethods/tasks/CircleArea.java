package day23_CustomMethods.tasks;

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter diameter to calculate area of the circle");
        circleArea(scan.nextDouble());
    }




    public static void circleArea(double diameterOfCircle){

        System.out.println("Area of the circle is "+(diameterOfCircle/2*diameterOfCircle/2*3.14));
    }
}
/*
create a method that can calculate the area of a circle

 */