package day36_OOP_Inheritance.$scrumTeam;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, int ID,  double salary, String companyName) {
        super(name, age, gender, ID, "Product Owner", salary, companyName);
    }

    public void clintMeeting(){
        System.out.println(name+" is meeting with client");
    }
}
