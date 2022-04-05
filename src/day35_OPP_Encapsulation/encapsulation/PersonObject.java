package day35_OPP_Encapsulation.encapsulation;

public class PersonObject {

    public static void main(String[] args) {

        Person person1=new Person();
        person1.setName("Ahmet");
        person1.setAge(23);

        System.out.println(person1.getName()+" : "+person1.getAge());

    }
}
