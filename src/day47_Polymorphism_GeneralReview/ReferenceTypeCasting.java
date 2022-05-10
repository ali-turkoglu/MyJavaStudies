package day47_Polymorphism_GeneralReview;

import day43_OOP_Abstraction.animal.Animal;
import day43_OOP_Abstraction.animal.Cat;
import day43_OOP_Abstraction.animal.Dog;
import day45_OOP_Abstract_Interface.shape.Circle;
import day45_OOP_Abstract_Interface.shape.Shape;
import day45_OOP_Abstract_Interface.shape.Square;
import week17.interface_demo.ChromeDriver;
import week17.interface_demo.WebDriver;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        Shape shape=(Shape) new Circle(4); // upcasting

        Shape shape2= new Circle(5); // upcasting implicitly

        WebDriver driver=(ChromeDriver) new ChromeDriver(); // upcasting

        System.out.println("----------------------------------------");

        Animal animal1=new Dog("Lasky",'M',2,"small","brown");

        ((Dog)animal1).bark(); // downcasting --> It must be automatically


        Animal animal2=new Dog("Lasky",'M',2,"small","brown");

        Animal dog=animal2;
        Animal dog2=animal2;

        System.out.println("dog = " + dog);
        System.out.println("dog2 = " + dog2);
        System.out.println("animal2 = " + animal2);

        boolean isEqual1=animal2.equals(dog);
        boolean isEqual2=animal2.equals(dog2);
        boolean isEqual3=dog.equals(dog2);

        System.out.println("isEqual1 = " + isEqual1);
        System.out.println("isEqual2 = " + isEqual2);
        System.out.println("isEqual3 = " + isEqual3);

        System.out.println("---------------------------------------");

        Shape shape1=new Square(3);

        System.out.println(((Square) shape1).getX());

        System.out.println("---------------------------------------");

        Animal animal=new Cat("jim",'M',3,"small","white");
        //animal.meow();  -->  bu şekilde kullanamayız

        ((Cat)animal).meow(); // --> bu method bir kere kullanılacaksa

        Cat cat= (Cat)animal;
        // --> Cat methodları birçok kez kullanılacaksa yeni variable declare edilir
        cat.meow();

        // ((Dog)animal).bark();  --> çalıştırılınca hata verir
        // Exception in thread "main" java.lang.ClassCastException:

    }
}
