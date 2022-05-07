package day46_Polymorphism;


import day45_OOP_Abstract_Interface.shape.*;

public class Instanceof_keyword {

    public static void main(String[] args) {

        Shape shape = new Circle(5);
        shape.area();

        //  System.out.println( shape.getRadius());
        // System.out.println( shape.PI);

        boolean isSquare = shape instanceof Square;
        boolean isCube = shape instanceof Cube;
        boolean isCylinder = shape instanceof Cylinder;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isCube = " + isCube);
        System.out.println("isCylinder = " + isCylinder);
        System.out.println("isCircle = " + isCircle);



        /*
        WebDriver driver:
            if(driver instanceof Chrome){
                Chrome browser will open
            }else if(driver instanceof firefox){
                Firefox browser will open
            }
            ...
         */

    }



}
