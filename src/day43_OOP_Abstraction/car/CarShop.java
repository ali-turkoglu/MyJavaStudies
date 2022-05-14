package day43_OOP_Abstraction.car;

public class CarShop {
    public static void main(String[] args) {

        // Car car1=new Car();  --> we can not create object from Abstract class,
        // because abstract class is not concrete


        Car car1=new Honda("Accord","Grey",2019,45000);
        Car car2=new Audi("A6","Grey",2021,65000);
        Car car3=new Tesla("T1","White",2020,55000);

        Honda car4=new Honda("Civic","Black",2015,25000);
        Audi car5=new Audi("Q7","Red",2021,85000);
        Tesla car6=new Tesla("Model3","Blue",2019,55000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);

        System.out.println("----------------------------");

        System.out.println(car1);
        car1.setColor("Red");
        car1.setPrice(33222);
        System.out.println(car1);

        Car test=new Honda("Civic","Black",2015,25000);
        System.out.println(test);


        Tesla ob=new Tesla("Model3","Blue",2019,55000);
        ob.start();


    }
}
