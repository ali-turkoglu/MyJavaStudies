package day44_OOP_Abstract_Interface.tasks.cars;

public class CydeoCar extends Car implements AutoPilot,Flyable{

    public CydeoCar( String model, int year, double price, String color) {
        super("CydeoCar", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getBrand()+" can park everywhere automatically");
    }

    @Override
    public void selfDrive() {
        System.out.println(getBrand()+" has high level auto pilot");
    }

    @Override
    public void start() {
        System.out.println(getBrand()+" can recognize you and just press the gas pedal to start");
    }

    @Override
    public void drive() {
        System.out.println("Driving "+getBrand()+" is enjoyable, and more comfortable ");
    }

    @Override
    public void fly() {
        System.out.println(getBrand()+" can fly");
    }
}
