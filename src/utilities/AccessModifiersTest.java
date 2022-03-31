package utilities;

import day34_GarbageCollection_AccessModifiers.Access_Modifiers;

public class AccessModifiersTest {

    public static void main(String[] args) {

        System.out.println(Access_Modifiers.publicData);

        //System.out.println(Access_Modifiers.defaultData);
        // default modifier sadece kendi package içinden ulaşılabildiğinden paket dışında hata veriyor.



        //System.out.println(Access_Modifiers.privateData);
        // private modifier sadece kendi class içinden ulaşılabildiğinden
        // aynı package olsa bile ulaşılamıyor.


        System.out.println("---------------------------------------------------------");

        Access_Modifiers.method1();

        //Access_Modifiers.method2();  --> we can not call default modifier from different package

        //Access_Modifiers.method3();  --> we can not call private modifier from different class or package

    }
}
