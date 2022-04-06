package day36_OOP_Inheritance.phone;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone1=new Iphone("Iphone");


        System.out.println(iphone1);
        iphone1.faceTime("etset@test.com");
        iphone1.call(212154565);


        Samsung s1=new Samsung();

        s1.text(234454565);
        System.out.println(s1);
    }


}
