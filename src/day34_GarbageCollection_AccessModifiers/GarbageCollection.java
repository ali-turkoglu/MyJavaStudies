package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass_Intro.Dog;
import day32_CustomClass_Constructor.Car;
import day33_CustomClass_Statics.Iphone;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        /*
        String str = null; // != ""

        System.out.println(str.toUpperCase());
*/

        String str="Wooden Spoon";  // after line 15 "Wooden Spoon" will be eligible fo garbage collection

        str=null;

        System.out.println(str);


        Car car1= new Car("Toyota");  // after line 27 these are unreferenced object for garbage collection

        System.out.println(car1);

        car1=null;

        System.out.println(car1);

        System.out.println("------------------------------------------------------");

        Dog dog1= new Dog();
        dog1.name="Lucy";

        dog1 =new Dog();  // After this lines first dog object is eligible for garbage collection
        dog1.name="Max";

        System.out.println(dog1);


        String language="Python";
        language="Java";         // After this line Python is unreferenced and eligible for garbage collection


        System.out.println("-------------------------------------------------------------");

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(100);
        ArrayList<Integer> list2=list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println( list1);
        System.out.println(list2);

        // burada bir tane object oluşturulmuştur. iki kapılı bir object. hangisine değer eklersek diğeri de etkilenir.

        System.out.println(list1==list2);
        // aynı object oldukları için == kullanılabilir ve list1 ve list2 garbage için uygun değildir.


        System.out.println("---------------------------------------------");


        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(33);

        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(44);
        l2=l1;

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);






    }
}
