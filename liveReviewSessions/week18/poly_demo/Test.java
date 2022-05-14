package week18.poly_demo;

public class Test {

    public static void main(String[] args) {

        Parent man1=new Father();
        man1.feedKid();
        man1.playWithKid();
        man1.raiseKid();


        Worker man2= new Father();
        man2.getPaid();
        man2.work("Driver");

        Father man3=new Father();
        man3.feedKid();
        man3.getPaid();
        man3.raiseKid();
        man3.work("Driver");
        man3.playWithKid();

        boolean b1=man1 instanceof Father;
        boolean b2=man2 instanceof Father;
        boolean b3=man3 instanceof Father;

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        ((Worker)man1).work("Driver");


    }
}
