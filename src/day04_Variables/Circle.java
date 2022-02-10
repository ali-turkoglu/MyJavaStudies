package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        /* Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
                PI, radius(yarıçap), diameter(çap), area, perimeter(çevre)
        Hints: 	PI = 3.14
        area = radius * radius * PI
        Perimeter = 2 diameter * radius * PI
        */
        double pi = 3.14;
        double radius = 5.5;

        double diameter = 2 * radius;
        double area = radius * radius * pi;
        double perimeter = diameter * pi;

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);




    }


}
