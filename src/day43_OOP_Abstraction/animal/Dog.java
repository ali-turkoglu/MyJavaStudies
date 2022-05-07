package day43_OOP_Abstraction.animal;

public class Dog extends Animal implements Playable{

    public Dog( String breed, char gender, int age, String size, String color) {
        super("Dog", breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getBreed()+" "+getName()+" is eating dog food");
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }


    public void play(){
        System.out.println(getName()+" is play with ball");
    }
}
