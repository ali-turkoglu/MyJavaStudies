package day44_OOP_Abstract_Interface.tasks.cars;

public class Tesla extends Car implements AutoPilot{

    public Tesla(String brand, String model, int year, double price, String color) {
        super(brand, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getBrand()+" can be auto park better than you");
    }

    @Override
    public void selfDrive() {
        System.out.println(getBrand()+" has auto pilot");
    }

    @Override
    public void start() {
        System.out.println("Say \" start \" to "+getBrand()+" in order to start");
    }

    @Override
    public void drive() {
        System.out.println("Driving "+getBrand()+" is enjoyable, and more comfortable");
    }
}
