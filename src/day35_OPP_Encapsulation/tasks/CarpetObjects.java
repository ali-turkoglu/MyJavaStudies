package day35_OPP_Encapsulation.tasks;

public class CarpetObjects {

    public static void main(String[] args) {

        Carpet obj1=new Carpet(5,3,35,true);
        System.out.println(obj1);
        System.out.println("Price: "+obj1.calcCost());

        obj1.setPersian(false);
        System.out.println(obj1);

        System.out.println("Price: "+obj1.calcCost());

    }
}
