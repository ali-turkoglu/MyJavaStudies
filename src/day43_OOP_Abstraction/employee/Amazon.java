package day43_OOP_Abstraction.employee;

public class Amazon {

    public static void main(String[] args) {



        Employee t1=new Tester("Ahmet",33,'M',23421,"QA",99999);
        Employee d1=new Developer("Ali",33,'M',234663,"Java developer",99999);
        Employee teacher1=new Teacher("Filiz",33,'F',23443,"Math teacher",99999);
        Employee driver1=new Driver("mehmet",33,'M',21111,"Lyft Driver",99999);


        System.out.println(t1);
        System.out.println(d1);
        System.out.println(teacher1);
        System.out.println(driver1);

        System.out.println("----------------------------------------");

        t1.work();
        t1.sleep();
        d1.work();
        driver1.work();
        teacher1.work();


    }
}
