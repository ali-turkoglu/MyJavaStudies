package day31_CustomClass_Constructor;

public class PersonObject {

    public static void main(String[] args) {


        Person person1=new Person("Smith",'M',43);

        Person person2=new Person("John",'M',45);

        Person person3=new Person("Shila",'F',36);

        person3.age=66;

        System.out.println(person3);

    }


}
