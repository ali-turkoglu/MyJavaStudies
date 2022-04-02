package week12;

public class Employee {

    public String name, jobTitle;
    public int ID;
    public double salary;


    public Employee(){

    }


    public Employee(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\nname='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                "}";
    }
}
