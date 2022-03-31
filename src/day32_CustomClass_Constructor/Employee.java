package day32_CustomClass_Constructor;

public class Employee {


    public String name,jobTitle;
    public char gender;
    public double salary;


    public Employee(String name){
        this.name=name;
    }

    public Employee(String name,String jobTitle){
        this(name);  // this.name=name;
        this.jobTitle=jobTitle;
    }

    public Employee(String name,String jobTitle,char gender){
        this(name,jobTitle);  // calling another constructor must be first step, first line
        this.gender=gender;
    }

    public Employee(String name,String jobTitle,char gender,double salary){
        this(name,jobTitle,gender);
        this.salary=salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
