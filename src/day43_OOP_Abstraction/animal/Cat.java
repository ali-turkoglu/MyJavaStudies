package day43_OOP_Abstraction.animal;

public class Cat extends Animal implements Playable{

    public Cat( String breed, char gender, int age, String size, String color) {
        super("Cat", breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getBreed()+" "+getName()+" is eating cat food");
    }

    public void meow(){
        System.out.println(getName()+" is meowing");
    }

    public void play(){
        System.out.println(getName()+" is play with ball");
    }

}
