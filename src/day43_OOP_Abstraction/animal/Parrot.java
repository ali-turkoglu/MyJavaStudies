package day43_OOP_Abstraction.animal;

public class Parrot extends Animal{

    public Parrot( String breed, char gender, int age, String size, String color) {
        super("Parrot", breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating chocalate");
    }
}
