package day43_OOP_Abstraction.shape;

public class Square extends Shape{

    private double x;




    public Square(double x){
        super("Square");
        setX(x);

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if (x<=0){
            throw new RuntimeException("Invalid value: "+x);
        }
        this.x = x;
    }

    @Override
    public double area(double x) {
        return x*x;
    }

    @Override
    public double perimeter(double x) {
        return 4*x;
    }

    @Override
    public double area(double x,double y) {
        return 0;
    }

    @Override
    public double perimeter(double x,double y) {
        return 0;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + getName() + '\'' +
                ", x=" + x +'\'' +
                ", area='" + area(x) + '\'' +
                ", perimeter='" + perimeter(x) + '\'' +
                '}';
    }

}
