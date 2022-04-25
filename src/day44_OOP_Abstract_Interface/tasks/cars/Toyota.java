package day44_OOP_Abstract_Interface.tasks.cars;

public class Toyota extends Car {

    public Toyota(String brand, String model, int year, double price, String color) {
        super(brand, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Say \" start\" to start "+getBrand());
    }

    @Override
    public void drive() {
        System.out.println(getBrand()+" can drive long distance with less fuel.");
    }
}
