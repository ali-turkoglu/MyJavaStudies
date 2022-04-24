package day43_OOP_Abstraction.employee;

public abstract class Employee extends Person{

    private final int id;
    private String jobTitle;
    private int salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, int salary) {
        super(name, age, gender);
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void work();

   /* @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping");
    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
abstract Employee extends Person:
			 id(final), jobTitle, salary...

			work();

 */