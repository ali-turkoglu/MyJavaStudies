package day44_OOP_Abstract_Interface.tasks.cars;

public class Mercedes extends Car implements AutoPark{

    public Mercedes(String brand, String model, int year, double price, String color) {
        super(brand, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getBrand()+" can be auto park better than you");
    }


    @Override
    public void start() {
        System.out.println(getBrand()+" starts with card");
    }

    @Override
    public void drive() {
        System.out.println("Driving "+getBrand()+" is enjoyable, and more comfortable");
    }
}
