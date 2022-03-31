package day33_CustomClass_Statics;

public class Iphone {

    public static String brand="Apple";

    public String model;

    public double price;

    public static String  operatingSystem="IOS";

    public String color;

    public String size;

    public static String madeIn="China";

    public static boolean hasBattery=true;

    public static boolean isTouchScreen=true;

    public static boolean hasFaceTime=true;

    public static void printModelAndPrice(){
        //System.out.println(model+" : "+ price);  // there is an Error because of instance obj
    }

    public void method1(){
        System.out.println(model+" : "+price); // instance objs
        System.out.println(madeIn);            // static obj
    }

    public static void printOperatingSystem(){
        System.out.println(operatingSystem);
    }


}
