package day35_OPP_Encapsulation;

public class CydeoStudents {

    public String name;
    public char gender;
    public int age;
    public String batchNumber;
    public int groupNumber;
    public  String fieldOfStudy;

    public static String schoolName;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudents(String name, char gender, int age, String batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName="CydeoSchool";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println("School is "+schoolName);
    }

    public static void printSecretCode(){
        System.out.println("Secret code is "+secretCode);

    }

    public void attendClass(){
        System.out.println(name+" is attending class.");
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
/*create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()


 */