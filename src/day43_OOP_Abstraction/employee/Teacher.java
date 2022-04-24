package day43_OOP_Abstraction.employee;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int id, String jobTitle, int salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+ getName()+" is teaching");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping");
    }
}
