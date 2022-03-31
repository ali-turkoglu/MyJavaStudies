package day32_CustomClass_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){

        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str){
        this(10);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls obj1=new ConstructorCalls(); // prints only default

        System.out.println("-------------------------------");

        ConstructorCalls obj2=new ConstructorCalls(10); // prints default and int

        System.out.println("---------------------------------");

        ConstructorCalls obj3=new ConstructorCalls("java"); // prints default, int, and String

    }



}
