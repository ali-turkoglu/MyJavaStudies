package day36_OOP_Inheritance.$scrumTeam;

public class Employee extends Person{

    public int ID;
    public String jobTitle;
    public double salary;

    public void setInfo(int ID, String jobTitle, double salary) {
        setInfo(this.name=name,this.age=age,this.gender=gender);
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                "ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +

                '}';
    }
}
