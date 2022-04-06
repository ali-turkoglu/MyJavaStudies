package day36_OOP_Inheritance.phone;

public class Samsung extends Phone{


    public Samsung( String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
    }

    public void freeze(){
        System.out.println(brand+" is freezing");
    }
}
