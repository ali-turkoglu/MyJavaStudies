package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        double totalTip = 0;
        //double tip = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Split:");
        String split = input.next();

        System.out.println("Number of people:");
        int numPeople = input.nextInt();

        System.out.println("Check amount:");
        double amount = input.nextInt();

        System.out.println("Service Quality:");
        String quality = input.next();


        if (split.equals("Yes")) {
            switch (quality) {
                case "Poor":
                    totalTip = (amount / 100) * 5;
                    break;
                case "Fair":
                    totalTip = (amount / 100) * 10;
                    break;
                case "Good":
                    totalTip = (amount / 100) * 15;
                    break;
                case "Great":
                    totalTip = (amount / 100) * 20;
                    break;
                case "Excellent":
                    totalTip = (amount / 100) * 25;
                    break;
            }


           // totalTip = tip * numPeople;
            double totalPay = amount + totalTip;
            double perPerson = totalPay / numPeople;

            System.out.println("Number of people entered: " + numPeople);
            System.out.println("Total to pay: " + totalPay);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + perPerson);
            System.out.println("Tip per person: " + (totalTip/numPeople));


        }


    }

}
