package day37_Inharitance_SuperKeyword.animalTask;

public class Dog extends Animal{

    public String bark;

    public Dog(String name, String breed, char gender, int age, String size, String color,String bark) {
        super(name, breed, gender, age, size, color);
        this.bark=bark;
    }
}
