package day38_Inheritance_Overridding.shapeTask;

public class Rectangle extends Shapes{

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.out.println("Invalid value for width: "+width );
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.out.println("Invalid value for length: "+ length);
            System.exit(1);
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
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
