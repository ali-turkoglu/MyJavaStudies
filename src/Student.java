import java.util.Arrays;

public class Student {   // Multiple class can use only using to share your solutions in discord channel

        public String name;
        public char gender;
        public int studentID;
        public char grade;

    public Student(String name){
            this.name=name;
        }

    public Student(String name, char gender){
            this(name);
            this.gender=gender;
        }

    public Student(String name, char gender, int studentID){
            this(name,gender);
            this.studentID=studentID;
        }

    public Student(String name,char gender,int studentID,char grade){
            this(name, gender, studentID);
            this.grade=grade;
        }

    public Student(String name,int studentID){
            this(name);
            this.studentID=studentID;
        }

    public Student(String name,int studentID,char grade){
            this(name,studentID);
            this.grade=grade;
        }

        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    ", studentID=" + studentID +
                    ", grade=" + grade +
                    '}';
        }

    }

class StudentObjects{
    public static void main(String[] args) {

        day33_CustomClass_Statics.Student student1=new day33_CustomClass_Statics.Student("Ahmet");
        System.out.println(student1);

        day33_CustomClass_Statics.Student student2=new day33_CustomClass_Statics.Student("Ahmet",'F');
        System.out.println(student2);

        day33_CustomClass_Statics.Student student3=new day33_CustomClass_Statics.Student("Mert",'M',234,'A');
        System.out.println(student3);

        System.out.println(student1==student2);  // false

        day33_CustomClass_Statics.Student[] students={student1,student2,student3};

        System.out.println(Arrays.toString(students));

        System.out.println(student1.name.equals(student2.name));
    }

}
