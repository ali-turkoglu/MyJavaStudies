package day37_Inharitance_SuperKeyword;

class A {
    public A() {
        System.out.println("A");
    }
}

class B extends A {
    public B() {
        System.out.println("B");
    }
}

public class ConstructorPractice {

    public static void main(String[] args) {

        B obj=new B();  //  when run, it prints A first line, than B the other line

    }
}
