package day36_OOP_Inheritance.$scrumTeam;

public class Person {

    public String name;
    public int age;
    public char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String eat){
        System.out.println(name+" is eating"+eat);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
    /*
    ScrumTeam Task:
        1. Create a class named Person
        variables:
        name, age, gender

        methods:
        setInfo(): sets the name, age, gender of person
        eat(String food)
        drink(String drink)
        toString()

        2.

	3. Create a sub class of Employee named Tester:

        Add any extra variable or method that Tester object need to have


        4. Create a sub class of EMployee named Developer:

        Add any extra variable or method that Developer object need to have

        5. Create a sub class of EMployee named BusinessAnalyst:

        Add any extra variable or method that BusinessAnalyst object need to have

        6. Create a sub class of EMployee named ProductOwner:

        Add any extra variable or method that ProductOwner object need to have

        7. Create a sub class of EMployee named ScrumMaster:

        Add any extra variable or method that ScrumMaster object need to have


        8. Creat a class named ScrumTeam:
        Variables:
        PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
        testers (ArrayList<Testers>),  developers (ArrayList<Developers>)

        Methods:
        addTester(Tester tester): adds the given tester to testers arraylist

        ddTesters(Tester[] testers): adds the given testers to testers arraylist

        removeTester(int id): removes the tester with the given id from the arraylist of tester

        addDeveloper(Developer developer): adds the given developer to testers arraylist

        addDeveloper(Developer[] developer): adds the given developers to testers arraylist

        removeDeveloper(int id): removes the developer with the given id from the arraylist of developer

        toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers


        9. Create a class named AmazonInc:

        create the objects of ProductOwner, ScrumMaster, and BusinessAnalyst
        Create 4 objects of Testers
        Create 5 Objects of Developers

        Create an object of ScrumTeam

        Add the ProductOwner, ScrumMaster, and BusinessAnalyst, Testers and Developers object into the scrum team

*/