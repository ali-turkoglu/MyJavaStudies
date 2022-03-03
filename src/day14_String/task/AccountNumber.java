package day14_String.task;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String accountNumber=scan.next();

        if(accountNumber.charAt(0)=='2'||accountNumber.charAt(0)=='5') {
            if (accountNumber.charAt(0) == '2' && !(accountNumber.length() == 7) || accountNumber.charAt(0) == '5' && !(accountNumber.length() == 10)) {
                System.out.println("Invalid account number");
            }else{
                System.out.println("Account number is valid");
            }

        }else{
            System.out.println("Invalid account number");
        }
    }
}
/*
    Create a class called AccountNumber.
        Ask the user enter an account number (String). Check if these account number is valid.
        > If the account number begins with a “2” the account number should be 7 characters long
        > If the account number begins with a “5” the account number should be 10 characters long
        —> If the account number does not begin with a 2 or a 5 OR the account number lengths
        do not meet the expected results print “Invalid account number”*/
