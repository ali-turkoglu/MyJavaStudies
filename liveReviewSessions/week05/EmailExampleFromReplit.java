package week05;

import java.util.Locale;
import java.util.Scanner;

public class EmailExampleFromReplit {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter a valid email: craig_federighi@apple.com");

        String email=input.next();

        int indexOf_=email.indexOf("_");
        int indexOfAtSign=email.indexOf("@");
        int indexOfDot=email.indexOf(".");

        String firstName=email.substring(0,indexOf_);
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println("firstname: "+firstName);

        String lastName=email.substring(indexOf_+1,indexOfAtSign);
        //lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        //lastName=(""+lastName.charAt(0)).toUpperCase();
        lastName=lastName.toUpperCase().charAt(0)+lastName.substring(1).toLowerCase();
        System.out.println("lastName = " + lastName);
        // if you use charAt method BE CAREFULL , you get char not string


        String domainName=email.substring(email.indexOf("@")+1,email.indexOf("."));
        domainName=domainName.substring(0,1).toUpperCase()+domainName.substring(1).toLowerCase();
        System.out.println("domainName = " + domainName);






    }
}
/*

//Write a program that will print out information about user based on email.
Print first name, last name, and domain.
 First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
//
//        Example:
//
//
//        Input: craig_federighi@apple.com
//
//

//
//        Output:
//        First name: Craig
//        Last name: Federighi
//        Domain: apple
//
 */