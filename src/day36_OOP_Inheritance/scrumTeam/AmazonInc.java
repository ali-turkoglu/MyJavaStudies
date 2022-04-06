package day36_OOP_Inheritance.scrumTeam;

public class AmazonInc {

    public static void main(String[] args) {

        String company="Amazon Inc";
        ProductOwner PO=new ProductOwner("Suhaib",45,'M',345,120000,company);
        ScrumMaster SM=new ScrumMaster("Cihad",34,'M',234,110000,company);
        BusinessAnalyst BA=new BusinessAnalyst("Anel",25,'F',432,124000,company);


        Tester t1=new Tester("Ahmet",43,'M',222,"SDET",110000,company);
        Tester t2=new Tester("Irena",34,'F',2223,"QA",120000,company);
        Tester[] testerList={t1,t2};

        Developer d1=new Developer("Yasaman",33,'F',343,"Java Developer",120000,company);
        Developer d2=new Developer("Daniela",23,'F',334,"Python Dev.",130000,company);
        Developer[] devList={d1,d2};

        ScrumTeam ST1=new ScrumTeam(PO,BA,SM);
        System.out.println(ST1);

        ST1.addDevelopers(devList);
        ST1.addTesters(testerList);
        System.out.println(ST1);

        System.out.println("------------------------------------------------------------------");

        // to print every team members name

        for (Tester each : ST1.testers) {
            System.out.println(each);
        }





    }
}
