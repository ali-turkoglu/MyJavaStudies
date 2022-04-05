package day35_OPP_Encapsulation;

public class PersonTest {

    public static void main(String[] args) {

        Person person1=new Person("Aron","Eng",43,'M');

        System.out.println(person1);
        Person.printPlanetName();
        person1.drink("water");
    }
}
