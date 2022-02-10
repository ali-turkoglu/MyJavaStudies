package day05_Concatenation;

public class FullName2 {
    public static void main(String[] args) {
        String firstName ="Ahmet";
        String lastName ="Bal";
        String fullName  = firstName+ " " + lastName;
        int age =44;
        String jobTitle = "Senior SDET";
        String company = "Oracle";
        double salary = 10000.54;

        // Full name of person is ____
        System.out.println("Full name of person is " + fullName + ".");

        //____is _____years old.
        System.out.println(fullName + " is " + age + " years old.");

        // Fullname is jobtitle, works at company, and fullname' salary is Salary
        System.out.println(fullName + " is " + jobTitle +", works at " + company + ", and " + fullName + "' salary is $ " +salary);





    }


}
