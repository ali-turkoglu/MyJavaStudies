package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);



        System.out.println("Enter your age:");
        int age=input.nextInt();                    //44Enter ---> 44 age ye gider. Enter tuşu scannerde kalır

        input.nextLine();                           //scanner daki Enter tuşu burada kullanılır.
        System.out.println("Enter your full name:");
        String name=input.nextLine();               // kullanıcının tekrar input imkanı olur. Enterle birlikte girilen bilgiler scanner da input a tanımlanır.

        System.out.println("age = " + age);
        System.out.println("name = " + name);




        input.close();
    }
}
/*
1.Ask the user to enter age - nextInt()
1.Ask the user to enter full name - nextLine()
2.
 */