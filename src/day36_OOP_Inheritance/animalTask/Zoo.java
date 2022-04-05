package day36_OOP_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

       /* Animal dog1=new Animal();


*/

        Dog dog1=new Dog();
        dog1.name="Lusy";
        dog1.age=4;
        dog1.sleep();
        dog1.bark();
        System.out.println(dog1);

        System.out.println("------------------------------------------------------------");


        Cat cat1=new Cat();
        cat1.setInfo("Minn","Van",'M',3,"Small","Dirty-White");

        cat1.sleep();
        cat1.drink();
        cat1.scratch();
        System.out.println(cat1);

        System.out.println("-------------------------------------------------------------");


        Tiger tiger1=new Tiger();
        tiger1.setInfo("Sher Khan","Bengal",'M',4,"Large","Red");
        tiger1.roar();
        System.out.println(tiger1);


    }
}
