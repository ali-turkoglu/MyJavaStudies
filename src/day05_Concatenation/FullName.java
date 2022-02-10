package day05_Concatenation;

/*
Create a class called FullName.java
        2. Declare the following variables:
        1. firstName
        2. lastName
        3. Use concatenation to print the full address
*/

public class FullName {
    public static void main(String[] args) {
        String firstName = " Cydeo";
        String lastName = "Java SDET";
        String fullname = firstName + " " + lastName;

        System.out.println(firstName +" "+ lastName);
        System.out.println(fullname);
        System.out.println(fullname + " is the name of the course I attented." );


    }

}
