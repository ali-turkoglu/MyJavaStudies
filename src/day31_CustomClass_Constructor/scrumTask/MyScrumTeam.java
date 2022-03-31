package day31_CustomClass_Constructor.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        // 3 testers objects
        Tester tester1=new Tester("Ahmet",234,"QA",90000);
        Tester tester2=new Tester("Layan",232,"SDET",110000);
        Tester tester3=new Tester("Alex",345,"SDET",121111);

        // 4 developers objects
        Developer developer1=new Developer("Olga",123,"Java Developer",130000);
        Developer developer2=new Developer("Aygun",211,"Java Master",150000);
        Developer developer3=new Developer("Tunc",423,"Senior Developer",110000);
        Developer developer4=new Developer("Sinem",112,"Software Developer",140000);

        // 1 ScrumTeam object
        ScrumTeam scrum=new ScrumTeam("Nigara","Huseyin","Muhtar",14);

        scrum.addTester(tester1);
        scrum.addTester(tester2);
        scrum.addTester(tester3);

        Developer[] developers={developer1,developer2,developer3,developer4};
        scrum.addDevelopers(developers); // to add devops array list we use custom method in custom class

        System.out.println(scrum);

        System.out.println("--------------------------------------------");

        // to print each of the tester in Scrum team
        for (Tester each : scrum.testersList) {
            System.out.println(each.name+" : "+ each.salary);
        }

        System.out.println("---------------------------------------------");

        for (Developer each : scrum.devopsList) {
            System.out.println(each.name+" . "+each.salary);
        }

        System.out.println("----------------------------------------------");
        System.out.println(scrum);
        scrum.removeDeveloper(123);
        System.out.println(scrum);





    }
}
/*
create a class called MyScrumTeam:
1. create an array of Testers and add the testers from your group
2. create an array of developers add the developers from your group
3. create an object of ScrumTeam and store the testers & developers above to the scrum team


 */