package day40_Protected_Final;

public class Protected_AccessModifier {

    static String name1="Cydeo"; // default access modifier

    protected static String name2="Wooden Spoon"; // protected

    static void method1(){
        System.out.println("method1");
    }

    protected static void method2(){
        System.out.println("we can reach protected out of package if its subclass");
    }


}
