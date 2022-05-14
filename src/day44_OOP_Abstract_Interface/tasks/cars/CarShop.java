package day44_OOP_Abstract_Interface.tasks.cars;

public class CarShop {

    public static void main(String[] args) {

        Audi audi1=new Audi("Q7",2022,77000,"white" );
        Honda honda1=new Honda("honda","Accord",2014,33000,"black");
        Toyota toyota1=new Toyota("Toyota","Avensis",2019,55000,"red");
        BMW bmw1=new BMW("320i",1999,24000,"red");
        Tesla tesla1=new Tesla("Tesla","Model3",2020,50000,"grey");
        Mercedes mercedes1=new Mercedes("Mercedes","E200",2010,60000,"black");
        CydeoCar cydeoCar1=new CydeoCar("FutureX",2025,13000,"light blue");

        System.out.println(audi1);
        audi1.autoPark();
        audi1.drive();
        audi1.stop();


        System.out.println("-------------------------------------------------");

        System.out.println(honda1);
        honda1.drive();
        honda1.stop();

        System.out.println("-------------------------------------------------");

        System.out.println(toyota1);
        toyota1.drive();
        toyota1.stop();

        System.out.println("-------------------------------------------------");

        System.out.println(bmw1);
        bmw1.drive();
        bmw1.stop();


        System.out.println("-------------------------------------------------");

        System.out.println(tesla1);
        tesla1.autoPark();
        tesla1.selfDrive();
        tesla1.drive();
        tesla1.stop();

        System.out.println("-------------------------------------------------");

        System.out.println(mercedes1);
        mercedes1.autoPark();
        mercedes1.drive();
        mercedes1.stop();

        System.out.println("-----------------------------------------------------");

        System.out.println(cydeoCar1);
        cydeoCar1.autoPark();
        cydeoCar1.fly();
        cydeoCar1.selfDrive();

        System.out.println("----------------------------------------------------------");

        Car car1=new Honda("honda","Accord",2014,33000,"black");
        car1.start();

    }
}
