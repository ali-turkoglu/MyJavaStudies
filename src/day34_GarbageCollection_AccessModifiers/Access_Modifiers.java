package day34_GarbageCollection_AccessModifiers;

public class Access_Modifiers {

    public static int publicData=100;

    static int defaultData=200;  // default modifier

    private static int privateData=300;

    public static void main(String[] args) {

        System.out.println(publicData);

        System.out.println(defaultData);

        System.out.println(privateData);


    }

    public static void method1(){
        System.out.println("public");
    }

    static void method2(){
        System.out.println("default");
    }

    private static void method3(){
        System.out.println("private");
    }



}
