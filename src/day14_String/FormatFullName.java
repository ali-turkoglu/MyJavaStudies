package day14_String;

public class FormatFullName {
    public static void main(String[] args) {

        String firstName="cyDEo", lastName="SCHOOL";

        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();  // Cydeo

        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();   //School

        String fullName=firstName+" "+lastName;  // Cydeo School

        System.out.println("firstName:"+firstName);
        System.out.println("lastName: "+lastName);
        System.out.println("fullName = " + fullName);


    }
}
