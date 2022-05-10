package day47_Polymorphism_GeneralReview;

public class InharitanceReview {

    public InharitanceReview(int a){
        System.out.println("Parent class' constructor");
    }

    int a;

    void method1(){

    }

}

class A extends InharitanceReview{

    public A(int a){
        super(a);
    }

}

class B extends InharitanceReview{

    public B(int a) {
        super(a);
    }
}

class C extends InharitanceReview{

    public C(int a) {
        super(a);
    }

}

class Aa extends A{

    public Aa(int a) {
        super(a);
    }
}

class Bb extends B{

    public Bb(int a) {
        super(a);
    }
}

class Cc extends C{

    public Cc(int a) {
        super(a);
    }
}

class D{
    void method(){
        super.toString(); //Object class
    }
}