package day38_Inheritance_Overridding.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle c1=new Circle(5);
        System.out.println("c1 = " + c1);
        c1.setRadius(3);
        System.out.println("c1 = " + c1);

        System.out.println("-------------------------------------------------");

        Square s1=new Square(5);
        System.out.println("s1 = " + s1);
        s1.setSide(20);
        System.out.println("s1 = " + s1);

        System.out.println("---------------------------------------------------");


        Rectangle r1=new Rectangle(5,7);
        System.out.println("r1 = " + r1);
        r1.setLength(-3);
        System.out.println("r1 = " + r1);




    }
}
