package day32_CustomClass_Constructor;

public class Test {

    public Test(){ //A
        System.out.println("A");
    }

    public Test(int a){  // A  B
        this();
        System.out.println("B");
    }

    public Test(double b){ // A B C
        this(10);
        System.out.println("C");
    }

    public Test(String str){  // A B C D
        this(2.2);
        System.out.println("D");
    }


    public static void main(String[] args) {

        new Test("java");
    }

}
