package day43_OOP_Abstraction.animal;



public class Zoo {

    public static void main(String[] args) {

        Cat cat1=new Cat("Minn",'M',3,"Small","Dirty-White");
        Dog dog1=new Dog("Lasky",'M',2,"small","brown");

        System.out.println(cat1);
        System.out.println(dog1);

        dog1.eat();
        cat1.eat();

    }
}
