package week13.encapsulation;

public class Person {

    private String fistName,lastName;
    private int age;

    public Person(){
        this.fistName="undefined";
        this.lastName="undefined";
        age=-1;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
/*
Person class has following attributes:

- private String instance variables: firstName, lastName
- private int instance variable: age

Methods:
- getter and setter methods for each instance variable. try to use this. keyword
- toString method.No parameters and Returns(does not print! no println in the method!) person info in this format: "firstName | lastName | age"

Constructors:

1) No-Args constructor
-sets default values for the Person object
name and lastName => "undefined"
age => -1

2) 3-Args Constructor:
- accepts firstName, lastName, age parameters and assigns values to encapsulated instance variable
try to use this. keyword

Examples:


 */