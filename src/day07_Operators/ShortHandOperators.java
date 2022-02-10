package day07_Operators;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class ShortHandOperators {
    public static void main(String[] args) {

        // assignment  =
        int number = 100;
        System.out.println("number = " + number);
        number = 200;
        System.out.println("number = " + number);

        String word = " java programing";
        System.out.println("word = " + word);
        word = "softskill";
        System.out.println("word = " + word);

        // addition assignment
        int x = 100;
        x += 200;       // mean x = x + 200
        System.out.println("x = " + x);

        String name = "ali";
        name += " turkoglu";
        System.out.println("name = " + name);

        //subtraction assignment
        double avaliableBalance = 500;
         //withdrawing  $ 200, then balance $ 400
        avaliableBalance -= 200;  // 300
        System.out.println("avaliableBalance = " + avaliableBalance);

        // multiplication assignment
        double salary = 50000.50;
        salary *= 2;
        System.out.println("salary = " + salary);

        //division assignment
        double num2 = 25000;
        num2 /= 2 ;
        System.out.println("num2 = " + num2);

        // remainder assignment

        double num3 = 100;
        num3 %= 7;   // 2
        System.out.println("num3 = " + num3);

        int amount = 127; // cents
        int quarters = amount / 25;
        int cents= amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("-------------------------------");

        int cents2 = 127;
        cents2  %= 25;
        System.out.println("cents2 = " + cents2);




    }
}
