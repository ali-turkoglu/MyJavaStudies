package day36_OOP_Inheritance.employeeTask;

public class Cydeo {

    public static void main(String[] args) {

        Teacher teacher1=new Teacher();
        teacher1.setInfo("Muhtar",'M',35,"Java Class",234,110000,"Cydeo School");

        Tester tester1=new Tester();
        tester1.setInfo("Ahmet",'M',43,"QA",122,110000,"Cydeo Software");

        Developers developers1=new Developers();
        developers1.setInfo("Olga",'F',34,"Dev Lead",87,189000,"Cydeo Software");

        teacher1.work();
        tester1.work();
        developers1.work();

        System.out.println(teacher1);
        System.out.println(tester1);
        System.out.println(developers1);
    }
}
