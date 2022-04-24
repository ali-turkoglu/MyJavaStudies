package day43_OOP_Abstraction.shape;

public class Rectangular extends Shape{

    private double x,y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Rectangular(double x, double y) {
        super("Rectangular");
        setX(x);
        setY(y);
    }

    @Override
    public double area(double x) {
        return 0;
    }

    @Override
    public double area(double x, double y) {
        return x*y;
    }

    @Override
    public double perimeter(double x) {
        return 0;
    }

    @Override
    public double perimeter(double x, double y) {
        return (x*2)+(y*2);
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "name='" + getName() + '\'' +
                ", x=" + x +'\'' +
                ", y=" + y +'\'' +
                ", area='" + area(x,y) + '\'' +
                ", perimeter='" + perimeter(x,y) + '\'' +
                '}';
    }
}
