package day09_IfStatements;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {

        System.out.println("Please enter your age to learn your age group\n");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (age >= 0 && age <= 2) {
            System.out.println("Infant");
        } else if (age >= 3 && age <= 5) {
            System.out.println("Toddler");
        } else if (age >= 6 && age <= 9) {
            System.out.println("Kid");
        } else if (age >= 10 && age <= 12) {
            System.out.println("Pre-Teen");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Teenager");
        } else if (age >= 18 && age <= 20) {
            System.out.println("Young Adult");
        } else if (age >= 21 && age <= 39) {
            System.out.println("Adult");
        } else if (age >= 40 && age <= 49) {
            System.out.println("Young Middle Age-Aged Adult");
        } else if (age >= 50 && age <= 54) {
            System.out.println("Middle-Aged Adult");
        } else if (age >= 55 && age <= 64) {
            System.out.println("Very Young Senior Citizen");
        } else if (age >= 65 && age <= 74) {
            System.out.println("Young Senior Citizen");
        } else if (age >= 75 && age <= 84) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Old Senior Citizen");
        }
    }
}
