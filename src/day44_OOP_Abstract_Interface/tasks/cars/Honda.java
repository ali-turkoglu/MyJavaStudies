package day44_OOP_Abstract_Interface.tasks.cars;

public class Honda extends Car{

    public Honda(String brand, String model, int year, double price, String color) {
        super(brand, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getBrand()+" is starting with key");
    }

    @Override
    public void drive() {
        System.out.println(getBrand()+" takes too much noise when you are driving");
    }
}
