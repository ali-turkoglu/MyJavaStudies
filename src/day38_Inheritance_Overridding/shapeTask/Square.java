package day38_Inheritance_Overridding.shapeTask;

import day34_GarbageCollection_AccessModifiers.Constructor_vs_StaticBlock;

public class Square extends Shapes{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            System.out.println("Invalid side value: "+side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double area(){
        return side*side;
    }

    public double perimeter(){
        return 4*side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
