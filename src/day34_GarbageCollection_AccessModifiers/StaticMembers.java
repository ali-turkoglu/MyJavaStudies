package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    static class class1 {

    }       //static class can be created in another class, it can be only inner class

    public static int num = 0;      //  static variable and its initializing

    public static void method() {


    }  // static method; we can use only static variables in it.

    static {


    }               //  static block; if we can not initialize static variables in on statement, we can use this blok
                            // also, this is execute one time and before main method  -->  first and one time

    static class B {

    }    // we can create more than one inner static class

}

class C {

    public static void main(String[] args) {


    }

}

/*
static class D {             //  we can not create static class as outer class

}

 */