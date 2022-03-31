package day31_CustomClass_Constructor;

public class Rectangle {

    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length*width;
    }

    public double calcPerimeter(){
        return 2*(length+width);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculateArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
