package day11_SwitchScanner.tasks;

import java.util.Scanner;

public class BrowserWithSwitch {
    public static void main(String[] args) {


        System.out.println("Enter your Browser:");
        Scanner input=new Scanner(System.in);

        String browserName=input.next();

        switch (browserName){

            case "chrome": case "firefox": case "opera": case "safari": case "edge":
                System.out.println("Valid browser");
                break;

            default:
                System.err.println("Invalid browser");
        }

    }
}
/* write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary

 */