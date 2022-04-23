package day43_OOP_Abstraction.car;

public class Honda extends Car{

    public Honda(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public void start(){
        System.out.println("Twist the key to ignition");
    }


}
