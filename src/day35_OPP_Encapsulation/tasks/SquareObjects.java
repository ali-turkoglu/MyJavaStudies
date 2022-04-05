package day35_OPP_Encapsulation.tasks;

public class SquareObjects {

    public static void main(String[] args) {

        Square obj1=new Square(5);
        System.out.println(obj1.getSide()); // 5

        obj1.setSide(3);
        System.out.println(obj1.getSide());  // 3

        Square obj2=new Square(-3);
        System.out.println(obj2.getSide()); // Invalid Entry: -3  --> 0
    }
}
