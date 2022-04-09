package day35_OPP_Encapsulation.Candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        Candy c1=new Candy("KitKat",30,2.8,false);
        Candy c2=new Candy("MilkyWay",0,3.2,true);
        Candy c3=new Candy("Snickers",13,2.5,false);
        Candy c4=new Candy("Mounds",14,1.9,true);
        Candy c5=new Candy("Twix",21,0,false);


        ArrayList<Candy> ramazanPackage=new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5));

        c1.setBrand("KitKat");
        System.out.println(c1.getBrand());
        System.out.println(c1.calcCost());


        for (Candy each : ramazanPackage) {
            System.out.println(each.getBrand()+" "+each.getPrice());
        }

        for (Candy each : ramazanPackage) {
            System.out.println(each);
        }


    }
}
