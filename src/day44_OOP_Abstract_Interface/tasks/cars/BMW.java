package day44_OOP_Abstract_Interface.tasks.cars;

public class BMW extends Car{

    public BMW( String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getBrand()+" is start with card");
    }

    @Override
    public void drive() {

        System.out.println(getBrand()+" is driving easily");

    }
}
