package day30_CustomClass_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1=new Student();
        student1.setInfo("Muhtar",'M',34,333,'A');

        Student student2=new Student();
        student2.setInfo("John",'M',23,443,'B');

        Student student3=new Student();
        student3.setInfo("Aygun",'F',33,543,'B');

        Student student4=new Student();
        student4.setInfo("Hulya",'F',25,345,'A');

        Student student5=new Student();
        student5.setInfo("Mert",'M',54,233,'B');

        Student[] studentsArray={student1,student2,student3,student4,student5};
        for (Student each : studentsArray) {
            System.out.println(each);

        }
        System.out.println("--------------------------------------------------");
        // to find earlybirds
       // ArrayList<Student> studentList=new ArrayList<>();
        //studentList.addAll(Arrays.asList(student1,student2,student3,student4,student5));

        ArrayList<Student> earlyBirds= new ArrayList<>(); // grade A
        ArrayList<Student> angryBirds=new ArrayList<>();

        for (Student each : studentsArray) {
            if (each.grade=='A'){
                earlyBirds.add(each);
            }else{
                angryBirds.add(each);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);






    }
}
