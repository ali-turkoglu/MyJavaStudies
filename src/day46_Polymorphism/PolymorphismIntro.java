package day46_Polymorphism;


//import day45_OOP_Abstract_Interface.shape.Square;

import day43_OOP_Abstraction.animal.Animal;
import day43_OOP_Abstraction.animal.Dog;
import day43_OOP_Abstraction.animal.Playable;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str="Wooden Spoon";

        Integer n1=2;

        Double d2=5.4;

        Boolean b1=true;

        Object [] array={str,n1,d2,b1};

        System.out.println("---------------------------------------------");


   //   reference           object
   //     type               type
        Animal animal=new Dog("Husky",'M',3,"Small","White");
        animal.drink();
        animal.eat();
        // animal.play();  --> only reference type can be called
        // animal.bark();  --> this is object's methods not reference's methods


        System.out.println("--------------------------------------");

        Playable animal2= new Dog ("Husky",'M',3,"Small","White");
        animal2.play();
        // animal2.eat();
        // animal2.drink();
        // animal2.bark();

    }
}
