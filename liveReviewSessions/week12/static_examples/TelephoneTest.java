package week12.static_examples;

import week12.Telephone;

public class TelephoneTest {

    public static void main(String[] args) {

        Telephone object1=new Telephone();

        System.out.println("totol: "+Telephone.total);
        System.out.println("quantity: "+Telephone.quantity);

        System.out.println("number: "+object1.number);

        object1.setNumber("3467393");
        System.out.println("number: "+object1.number);

        object1.getNumber("312 2121212");
        System.out.println("object1.number = " + object1.number);

        object1.setNumber("111-1111111");
        System.out.println("number: "+object1.number);




    }
}
