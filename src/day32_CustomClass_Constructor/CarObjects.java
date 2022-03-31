package day32_CustomClass_Constructor;

public class CarObjects {

    public static void main(String[] args) {

        Car car1=new Car("Toyota");
        Car car2=new Car("Honda","Accord");
        Car car3=new Car("Opel","Astra",2020);
        Car car4=new Car("Lexus","RX350",2012,"Black");
        Car car5=new Car("Tesla","Model 3",2019,"White",32000);


        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.out.println("car4 = " + car4);
        System.out.println("car5 = " + car5);

    }
}
