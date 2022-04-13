package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Tester t1=new Tester("Ahmet",23,'M',434,"QA",90000);
        Tester t2=new Tester("Aaron",33,'M',435,"QA",90000);
        Tester t3=new Tester("Harun",23,'M',436,"QA",90000);

        Developer d1=new Developer("Muhtar",54,'M',345,"Java ",90000);
        Developer d2=new Developer("Maria",34,'F',346,"Dev Lead ",90000);
        Developer d3=new Developer("Muhtar",54,'M',347,"Java Developer",90000);

        Student s1=new Student("Erol",23,'M',988,"Cyber Security");
        Student s2=new Student("Smith",33,'M',958,"QA / SDET");
        Student s3=new Student("Emily",23,'F',938,"Cyber Security");

        Teacher teacher=new Teacher("Asia",33,'F',233,"SoftSkill Teacher",899999);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(t1);
        System.out.println(s1);
        System.out.println(teacher);

        System.out.println("-----------------------------------------------------------------------");


        System.out.println("t2 = " + t2);
        t2.setName("Mehmet");
        System.out.println("t2 = " + t2);

        System.out.println("----------------------------------------------------------------------");

        t1.work();
        d1.work();
        teacher.work();

        System.out.println("----------------------------------------------------------------------");

        d2.drink();
        s2.eat();




    }
}
/*
 7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */