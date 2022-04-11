package day38_Inheritance_Overridding.carTask;

public class Toyota extends Car{

    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand+" is reliable car");
    }

    @Override
    public void start(){
        System.out.println("Twist the key to ignition to start"+brand+" "+model);
    }
}
