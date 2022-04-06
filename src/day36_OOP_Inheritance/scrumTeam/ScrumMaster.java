package day36_OOP_Inheritance.scrumTeam;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender, int ID,  double salary, String companyName) {
        super(name, age, gender, ID, "Scrum Master", salary, companyName);
    }

    public void arrangeMeeting(){
        System.out.println(name+" is arranging the today's meeting");
    }
}
