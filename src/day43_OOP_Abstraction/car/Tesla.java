package day43_OOP_Abstraction.car;

public final class Tesla extends Car{

    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\"");
    }

    public void autoPilot(){
        System.out.println(getMake() + " " + getModel()+" has auto pilot feature");
    }


}
