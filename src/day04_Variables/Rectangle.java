package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {

        /* write a program that can calculate the area & the perimeter of any given rectangle
            length : , weight, area, perimeter
            area = length * width
			perimeter =  2 * (length + width)
         */

        double length = 10.5;             // 10  mean 10.0 in double type
        double weight = 5.5;

        double area = length * weight;
        double perimeter = 2 * (length + weight);

        System.out.println("length = " + length);
        System.out.println("weight = " + weight);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }


}
