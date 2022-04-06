package day36_OOP_Inheritance.scrumTeam;

public class Developer extends Employee{ // Developer IS A Employee, Developer IS A Person

    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, ID, jobTitle, salary, companyName);
    }

    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }
}
