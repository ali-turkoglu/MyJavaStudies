package utilities;

import day40_Protected_Final.Protected_AccessModifier;

public class AccessModifiersTest3 extends Protected_AccessModifier {

    public static void main(String[] args) {

        // System.out.println(name1);   default is not visible outside the package

        System.out.println(name2); // protected always visible in subclass outside the package

        method2();
    }
}
