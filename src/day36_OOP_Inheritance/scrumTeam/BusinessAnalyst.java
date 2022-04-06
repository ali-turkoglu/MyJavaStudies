package day36_OOP_Inheritance.scrumTeam;

public class BusinessAnalyst extends Employee {

    public BusinessAnalyst(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, ID, "Business Analyst", salary, companyName);
    }

    public void srs() {
        System.out.println(name + " is working on SRS doc");
    }

}
