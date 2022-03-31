package day33_CustomClass_Statics.tasks;

public class Test {

    public static void main(String[] args) {

        CydeoStudent student1=new CydeoStudent("Ali",34,'M',234,'A',8,6);
        CydeoStudent student2=new CydeoStudent("Alonso",54,'M',233,'A',8,6);
        CydeoStudent student3=new CydeoStudent("Aria",24,'F',34,'A',8,6);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        student1.attendClass();

        student2.study();

        System.out.println(CydeoStudent.schoolName);
        CydeoStudent.printSchoolName();
    }
}
