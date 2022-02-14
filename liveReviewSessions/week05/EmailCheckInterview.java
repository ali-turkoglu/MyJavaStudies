package week05;

import java.util.Scanner;

public class EmailCheckInterview {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your email:");
        String email=input.next();
        String domain=email.substring(email.indexOf("@")+1);

        if (email.contains("@")&&domain.contains(".")&&email.substring(0,email.indexOf("@")).length()>0){
            System.out.println("email address is valid");

        }else if(email.indexOf("@")<1 ||email.indexOf("@")>=email.length()||email.indexOf("@")!=email.lastIndexOf("@")
                ||email.lastIndexOf(".")<1||email.lastIndexOf(".")==email.length()-1){
            System.out.println("email address is invalid");
        }


    }
}
 /*
Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false
 */