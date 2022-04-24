package day43_OOP_Abstraction.employee;

public abstract class Person {

    private String name;
    private final int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);

        if (age<=0){
            throw new RuntimeException("Invalid age: "+age);
        }
        this.age = age;

        if (!(gender=='M'|| gender=='F')){
            throw new RuntimeException("Invalid gender: "+gender);
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sleep();//{ System.out.println(name+" is sleeping"); }

    public void eat(){ System.out.println(name+" is eating");  }




    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
abstract Person:
			name, age, gender(final)

			eat();
			sleep();

 */