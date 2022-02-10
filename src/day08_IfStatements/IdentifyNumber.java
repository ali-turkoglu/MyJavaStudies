package day08_IfStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = 200;

        boolean isPossitive = number > 0;      //if 200 is positive true
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        System.out.println(number+ " is positive number: " + isPossitive);
        System.out.println(number+ " is negative number: " + isNegative);
        System.out.println(number+ " is zero           : "+ isZero);



    }

}
   /*
    Create a class called IdentifyNumber, and write a program that
    can identify if the given number is positive, or negative or zero.
        Ex:
        number = 200
        output:
        200 is positive number: true
        200 is negative number: false
        200 is zero: false
        */