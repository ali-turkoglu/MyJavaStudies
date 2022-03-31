package day34_GarbageCollection_AccessModifiers;

public class Access_ModifiersTest {

    public static void main(String[] args) {


        System.out.println(Access_Modifiers.publicData);

        System.out.println(Access_Modifiers.defaultData);

        //System.out.println(Access_Modifiers.privateData);

        // private modifier sadece kendi class içinden ulaşılabildiğinden
        // aynı package olsa bile ulaşılamıyor.

        System.out.println("---------------------------------------------------------");

        Access_Modifiers.method1();

        Access_Modifiers.method2();

        //Access_Modifiers.method3();  --> private modifier can not call different class


    }
}
