package day35_OPP_Encapsulation.encapsulation;

public class Circle {

    private double radius;
    public double pi=3.14;

    public Circle(double radius){
        this.pi=pi;
        setRadius(radius);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if (radius<=0){
            System.err.println("Invalid Entry"+radius);
            System.exit(0);
        }
        this.radius=radius;
    }

    public double calcPerimeter(){
        return 2*pi*radius;
    }

    public double calcArea(){
        return pi*(radius*radius);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}
/*
    Create a class named Circle

        private variables:
        radius

public variable:
        pi

        Encapsulate all the private fields

        1. radius of the circle can not be zero or negative

        Add a constructor that can set the raidus of circle when circle object is created

        Methods:
        calcArea()
        calcPerimeter()
        toString()
*/
