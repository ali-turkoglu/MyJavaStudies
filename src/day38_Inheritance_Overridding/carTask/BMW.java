package day38_Inheritance_Overridding.carTask;

public class BMW extends Car{


    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breakDown(){
        System.out.println(brand+" breaks down commanly");
    }
}
