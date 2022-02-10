package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName=input.nextLine();// ali turkogluEnter

        System.out.println("Enter your building number");
        String buildingNo=input.next();  //45654p

        input.nextLine();   // Enter
        System.out.println("Enter your street name");
        String streetName=input.nextLine(); // McKennedyEnter

        System.out.println("Enter your city name");
        String city=input.nextLine(); // McLeanEnter

        System.out.println("Enter your state");
        String state=input.nextLine(); // VA Enter

        System.out.println("Enter your zip code");
        String zipCode=input.next(); //45454

        input.nextLine();   // Enter
        System.out.println("Enter your country name");
        String country=input.nextLine(); //

        System.out.println(fullName+"\n"+buildingNo+streetName+"\n"+city+state+zipCode);


        input.close();
    }
}
/*
1.Enter your full name          -nextLine()
2.Enter your building number    -next()
3.Enter your street name        -nextLine()
4.Enter your city name          -nextLine()
5.Enter your state              -nextLine()
6.Enter your zip code           -next()

print shipping address
ad soyad
apt.
city state zip

 */