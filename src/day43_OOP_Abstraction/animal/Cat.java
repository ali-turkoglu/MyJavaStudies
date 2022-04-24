package day43_OOP_Abstraction.animal;

public class Cat extends Animal{

    public Cat( String breed, char gender, int age, String size, String color) {
        super("Cat", breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getBreed()+" "+getName()+" is eating cat food");
    }


}
