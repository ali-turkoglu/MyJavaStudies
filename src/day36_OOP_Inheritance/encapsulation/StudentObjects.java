package day36_OOP_Inheritance.encapsulation;

public class StudentObjects {

    public static void main(String[] args) {

        Student s1=new Student("Aaron",43,'A','Z',"Cydeo School");
        System.out.println(s1);

        s1.setGrade('B');
        System.out.println(s1);

        s1.study();


    }
}
