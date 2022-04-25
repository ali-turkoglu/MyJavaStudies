package day43_OOP_Abstraction.animal;

public  abstract class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size,color;

    public final static boolean canBreath; // in static block

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    static {
        canBreath=true;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed=breed;  // diğer instance variable ların şartları setter/getter kullanırken
                            // final lar burada tanımlanır
        if (!(gender=='M'||gender=='F')){
            throw new RuntimeException("Invalid gender: "+ gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        setColor(color);
    }



    public abstract void eat();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
