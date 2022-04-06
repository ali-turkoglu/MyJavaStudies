package day36_OOP_Inheritance.$scrumTeam;

public class Tester extends Employee {  // Tester IS A Employee, Tester IS A Person

    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, ID, jobTitle, salary, companyName);
    }

    public void createTicket() {
        System.out.println(jobTitle+" "+name + " is creating ticket");
    }

}
