package day43_OOP_Abstraction.employee;

public class Driver extends Employee{

    public Driver(String name, int age, char gender, int id, String jobTitle, int salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+ getName()+" is driving");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping");

    }
}
