package day39_Recap.cydeoTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeId, String jobTitle, int salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }


    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is writing test codes");
    }

    public void createTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating ticket");
    }


}
/*
  3. Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()


 */