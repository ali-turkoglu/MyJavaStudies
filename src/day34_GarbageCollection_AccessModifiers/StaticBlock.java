package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("main method");
    }

    static{
        System.out.println("static method 1"); // run first before anything, and only runs one time
    }

    static{
        System.out.println("static method 2");
    }
}
