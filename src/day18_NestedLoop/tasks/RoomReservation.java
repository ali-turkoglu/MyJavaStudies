package day18_NestedLoop.tasks;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int totalPrice=0;

        while (true) {


            System.out.println("Which bedroom do you want to reserve?");
            String bedroom = input.nextLine().toLowerCase();

            while (!(bedroom.equals("king bed") || bedroom.equals("queen bed") || bedroom.equals("single bed"))) {
                System.out.println("Invalid entry, please enter a bedroom type.");
                bedroom = input.nextLine().toLowerCase();
            }


            System.out.println("How many nights you are staying?");
            int night = input.nextInt();
            int price = 0;


            if (bedroom.equals("king bed")) {
                price = 120;
            } else if (bedroom.equals("queen bed")) {
                price = 100;
            } else {
                price = 80;
            }
            System.out.println("Would you like to reserve another room?");
            String a = input.next().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))) {
                System.out.println("Invalid entry, Do you want to reserve another room?");
                a = input.next().toLowerCase();
            }
            price*=night;
            totalPrice += price;

            input.nextLine();

            if (a.equals("no")) {
                System.out.println("Your price is "+ totalPrice);
                break;
            }

        }
    }
}
/* Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry



 */