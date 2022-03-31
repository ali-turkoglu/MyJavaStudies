package day31_CustomClass_Constructor;

public class Student {

    public String name;
    public int age;
    public char gender;
    public char grade;
    public int ID;

    public Student(String name, int age, char gender, char grade, int ID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.ID = ID;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", ID=" + ID +
                '}';
    }


}
