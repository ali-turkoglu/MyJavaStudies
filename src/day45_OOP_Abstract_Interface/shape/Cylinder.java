package day45_OOP_Abstract_Interface.shape;

public class Cylinder extends Shape implements Volume{

    private double radius;
    private double height;
    public final double pi=3.14;

    public Cylinder( double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return 2*pi*radius*height+2*pi*(radius*radius);
    }

    @Override
    public double perimeter() {
        return 0;
    }


    @Override
    public double volume() {
        return pi*height*(radius*radius);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
               super.toString()+'\'' +
                ", volume='" + volume() + '\'' +
                ", radius=" + radius +
                ", height=" + height +
                ", pi=" + pi +
                '}';
    }
}
