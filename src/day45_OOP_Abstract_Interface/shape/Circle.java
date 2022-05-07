package day45_OOP_Abstract_Interface.shape;

public class Circle extends Shape{

    private double radius;

    public final static double pi;

    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    static {
        pi=3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        if (radius<0){
            throw new RuntimeException("Invalid radius: " +getRadius());
        }
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return pi*radius*2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                "radius=" + radius +
                '}';
    }
}
