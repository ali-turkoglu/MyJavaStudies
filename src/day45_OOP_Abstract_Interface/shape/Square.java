package day45_OOP_Abstract_Interface.shape;

public class Square extends Shape{

    private double x;


    public Square(double x) {
        super("Square");
        setX(x);

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if (x<0){
            throw new RuntimeException("Invalid radius: " +getX());
        }
        this.x = x;
    }

    @Override
    public double area() {
        return 2*x;
    }

    @Override
    public double perimeter() {
        return 4*x;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                super.toString()+
                '}';
    }
}
