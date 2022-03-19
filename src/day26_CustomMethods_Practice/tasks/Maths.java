package day26_CustomMethods_Practice.tasks;

public class Maths {

    public static void main(String[] args) {

        int a = 12;
        int b = 4;
        System.out.println(sum(a, b));
        System.out.println(subtract(a, b));
        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));

        System.out.println("-------------------------------------------------------------------------");

        double d1 = 2.4;
        double d2 = 1.3;
        System.out.println(sum(d1, d2));
        System.out.println(subtract(d1, d2));
        System.out.println(multiply(d1, d2));
        System.out.println(divide(d1, d2));

        System.out.println("-------------------------------------------------------------------");

        System.out.println("21 isEven: " + isEven(21));
        System.out.println("28 isEven: " + isEven(28));

        System.out.println("----------------------------------------------------------------------");

        System.out.println("21 isOdd: " + isOdd(21));
        System.out.println("28 isOdd: " + isOdd(28));

        System.out.println("---------------------------------------------------------------------");

        System.out.println("max number: " + maxOfTwo(154, 66));

        System.out.println("-----------------------------------------------------------------------");

        System.out.println("min number: " + minOfTwo(43.4, 221.4));

        System.out.println("---------------------------------------------------------------------");

        System.out.println("square of 9 :" + square(9));
        System.out.println("square of 6 :" + square(6));
        System.out.println("square of 2.5 : " + square(2.5));


        System.out.println("------------------------------------------------------------------------");

        System.out.println("cube of 3 : " + cube(3));
        System.out.println("cube of 3.3 : "+ cube(3.3));


    }

    // sum of two int number, returns int
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }


    // sum of two  double numbers, returns double
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }


    // subtract two given numbers and returns the int
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }


    // subtract two given double numbers and returns double
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }


    // multiply two integer given number and returns int
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }


    // multiply two double numbers and returns double
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }


    // divide two given integer and returns the int
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }


    //divide two given double and returns the double
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }


    // returns if the given integer is even number
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    // return if the given is odd number
    public static boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }


    // returns the max number between two integer
    public static int maxOfTwo(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }


    // returns the max number between two double
    public static double maxOfTwo(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }


    // returns the min number between two integer
    public static int minOfTwo(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }


    // returns the min number between two integer
    public static double minOfTwo(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }


    // returns the square of an integer
    public static int square(int num) {
        return num * num;
    }


    // returns the square of a double
    public static double square(double num) {
        return num * num;
    }


    // returns the cube of an integer
    public static int cube(int num) {
        return num * num * num;
    }


    // returns the cube of a double
    public static double cube(double num) {
        return num * num * num;
    }


}
