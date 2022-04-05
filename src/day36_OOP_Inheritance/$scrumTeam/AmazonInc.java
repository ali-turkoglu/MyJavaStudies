package day36_OOP_Inheritance.$scrumTeam;

public class AmazonInc {

    public static void main(String[] args) {

        ProductOwner PO=new ProductOwner();
        PO.setInfo("Aaron",45,'M');
        PO.setInfo(234,"",90000);

        ScrumMaster SM=new ScrumMaster();
        SM.setInfo("Hulya",77,'F');
        SM.setInfo(232,"",78000);

        BusinessAnalyst BA=new BusinessAnalyst();
        BA.setInfo("Ahmet",34,'M');
        BA.setInfo(987,"",88999);

        Tester t1=new Tester();
        t1.setInfo("Aziz",22,'M');
        t1.setInfo(112,"",989999);

        Tester t2=new Tester();
        t1.setInfo("Azize",24,'F');
        t1.setInfo(116,"",779999);

        Tester[] testerList={t1,t2};

        Developer d1=new Developer();
        d1.setInfo("Mustafa",33,'M');
        d1.setInfo(444,"",88888);

        Developer d2=new Developer();
        d1.setInfo("Mouses",43,'M');
        d1.setInfo(424,"",835888);

        Developer[] devList={d1,d2};

        ScrumTeam ST=new ScrumTeam();
        ST.ddTesters(testerList);
        ST.ddDevelopers(devList);



        System.out.println(ST);

    }
}
