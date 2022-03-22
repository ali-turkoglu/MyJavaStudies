package day30_CustomClass_Intro;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public void setInfo(String carBrand, String carModel,String carColor,int carYear,double carPrice){
        brand=carBrand;
        model=carModel;
        color=carColor;
        year=carYear;
        price=carPrice;

    }

    public String toString() {
        return "Car:\n brand= " + brand +
                "\n model= " + model +
                "\n color= " + color+
                "\n year= "+year+
                "\n price= " + price ;
    }

    public void drive(){
        System.out.println("Driving "+brand+" "+model);

    }

    public void brake(){
        System.out.println(brand+" is braking");
    }

   public void start(){
       System.out.println(brand+" "+model+" has started");
   }

    public void stop(){
        System.out.println(brand+" "+model+" has stopped");
    }
}
