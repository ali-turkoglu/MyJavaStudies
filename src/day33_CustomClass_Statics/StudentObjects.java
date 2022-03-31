package day33_CustomClass_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1=new Student("Ahmet");
        System.out.println(student1);

        Student student2=new Student("Ahmet",'F');
        System.out.println(student2);

        Student student3=new Student("Mert",'M',234,'A');
        System.out.println(student3);

        System.out.println(student1==student2);  // false

        Student[] students={student1,student2,student3};

        System.out.println(Arrays.toString(students));

        System.out.println(student1.name.equals(student2.name));
    }
}
