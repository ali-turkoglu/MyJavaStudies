package day04_Variables;

public class Square {
    public static void main(String[] args) {
        /* write a program that can calculate the area & perimeter of any given square side
        side (3.5)

        are = side * side
        perimeter = 4 * side

                */

        double side = 3.5;
        double area = side * side;
        double perimeter = side * 4;

        System.out.println("side = " + side);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }


}
