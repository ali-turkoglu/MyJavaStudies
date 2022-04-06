package day36_OOP_Inheritance.phone;

public class Iphone extends Phone{

    public Iphone( String model, String size, String color, double price){
        super("Apple", model, size, color, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+" is using facetime with " +phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand+" is using "+email+" to facetime");
    }

}
