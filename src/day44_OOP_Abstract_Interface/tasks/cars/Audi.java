package day44_OOP_Abstract_Interface.tasks.cars;

public class Audi extends Car implements AutoPark{

    public Audi( String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getBrand()+" can be auto park");
    }


    @Override
    public void start() {
        System.out.println(getBrand()+" starts with key");
    }

    @Override
    public void drive() {
        System.out.println("Driving "+getBrand()+" is enjoyable");
    }
}
