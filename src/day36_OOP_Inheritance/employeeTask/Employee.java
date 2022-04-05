package day36_OOP_Inheritance.employeeTask;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public String jobTitle;
    public int ID;
    public double salary;
    public String companyName;

    public void setInfo(String name, char gender, int age, String jobTitle, int ID, double salary, String companyName) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
/*
Employee:
		name, gender, age, jobTitle, id, salary, companyName
		setInfo(), work(), toString()


	Tester

	Developer

	Driver

	Teacher

 */