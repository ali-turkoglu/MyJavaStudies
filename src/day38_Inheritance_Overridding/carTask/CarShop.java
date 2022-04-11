package day38_Inheritance_Overridding.carTask;

import java.lang.Object;
import  java.util.Objects;

import java.util.ArrayList;

public class CarShop {

    public static void main(String[] args) {

        Toyota toyota1=new Toyota("Corolla",2012,22000,"Silver",45000);
        Toyota toyota2=new Toyota("Avensis",2022,2000,"Silver",85000);

        BMW bmw1=new BMW("i5",2014,23000,"red",65000);

        Tesla tesla1=new Tesla("3",2021,89000,"white",15000);


        tesla1.autoPilot();
        tesla1.drive();
        System.out.println("tesla1.model = " + tesla1.model);

        toyota1.reliable();
        toyota1.drive();

        System.out.println("tesla1 = " + tesla1);
        System.out.println("bmw1 = " + bmw1);
        System.out.println("toyota1 = " + toyota1);
        System.out.println("toyota2 = " + toyota2);

        toyota1.start();
        tesla1.start();
        bmw1.start();


    }
}
