package week02;

public class CarInfo {
    public static void main(String[] args) {
        //
        int year = 2021;
        String make = "Audi";
        String model = "A6";
        boolean gear = true; // true : automatic, false : manual
        String color = "black";
        int milage = 0;
        int price = 400000;


        System.out.println(year + " " + make + " " + model +"\n"+"Automatic Transmission: "+ gear);
        System.out.println("Color : " + color+ "\n"+ "Millage : " + milage);
        System.out.println("Price :" + price);

        // exchange the price euro to tl

        double priceInTl = (price*15.5);
        System.out.println("Price in TL = " + priceInTl);


        }

    }



