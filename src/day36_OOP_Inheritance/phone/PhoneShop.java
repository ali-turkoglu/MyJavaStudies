package day36_OOP_Inheritance.phone;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone1=new Iphone("Iphone 11","6.7 inches","Silver",1200);

        Samsung s1=new Samsung("S11","6 inches","Gray",900);

        Nokia n1=new Nokia("Brick","4 inches","white",200);

        System.out.println(iphone1);
        System.out.println(s1);
        System.out.println(n1);


        iphone1.faceTime("etset@test.com");
        iphone1.call(212154565);
        iphone1.faceTime(321654);
        iphone1.text(654653);

        s1.text(234454565);
        s1.call(98654321);
        s1.freeze();

        n1.call(6543218);
        n1.text(65469621);

        System.out.println(Phone.hasBattery);
        System.out.println(iphone1.hasBattery);
        System.out.println(s1.hasBattery);
        System.out.println(Nokia.hasBattery);


    }


}
