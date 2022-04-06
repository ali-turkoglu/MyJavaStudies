package day36_OOP_Inheritance.phone;

public class Nokia extends Phone {


    public Nokia( String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }

    public void selfDefense(){
        System.out.println(brand+" has self defence features.");
    }
}
