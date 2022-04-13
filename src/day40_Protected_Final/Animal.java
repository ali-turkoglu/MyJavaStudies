package day40_Protected_Final;

public class Animal {
    private String name;
    private final String breed;
    private final char gender;
    private final String color;
    private String size;
    private int age;

    public Animal(String name,String breed, char gender, String color, String size, int age) {
        setName(name);
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        setSize(size);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void eat(){  // we can override
        System.out.println(name+" is eating");
    }

    public final void drink(){ // we can not override final methods
        System.out.println(name+" is drinking water");
    }

}
