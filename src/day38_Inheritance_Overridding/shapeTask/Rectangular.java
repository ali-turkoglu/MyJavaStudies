package day38_Inheritance_Overridding.shapeTask;

import java.lang.reflect.Constructor;

public class Rectangular extends Shapes{

    private double width;
    private double length;

    public Rectangular(double width, double length) {
        super("Rectangular");
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.out.println("Invalid value for width: "+width );
            return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.out.println("Invalid value for length: "+ length);
            return;
        }
        this.length = length;
    }

    public double area(){
        return width*length;
    }

    public double perimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
