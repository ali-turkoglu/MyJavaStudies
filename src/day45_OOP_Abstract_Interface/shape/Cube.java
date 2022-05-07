package day45_OOP_Abstract_Interface.shape;

public class Cube extends Shape implements Volume{

    private double x;


    public Cube(String name) {
        super(name);
        setX(x);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double area() {
        return 6*(x*x);
    }

    @Override
    public double perimeter() {
        return 12*x;
    }


    @Override
    public double volume() {
        return x*x*x;
    }

    @Override
    public String toString() {
        return "Cube{" +
                super.toString()+'\'' +
                ", volume='" + volume() + '\'' +
                "x=" + x +
                '}';
    }
}
