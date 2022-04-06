package day36_OOP_Inheritance.$scrumTeam;

public class Employee extends Person {

    public int ID;
    public String jobTitle;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender);
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work() {
        System.out.println(name + " is working");
    }


    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                "ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}

/*

Create a sub class of Person named Employee
        Extra variables:
        id, jobTitle, salary

        Extra methods:
        SetInfo(): sets the name, age, gender, id, jobTitle and salary of Employee Object
        Hint: after creating setInfo method of employee class, you can call the inheritend setInfo() to set the name, age, and gender

        work()

        toString(): generate toString seperately in Employee class so that name, age, gender, id, jobTitle and salary of the emplyee can be displayed

 */