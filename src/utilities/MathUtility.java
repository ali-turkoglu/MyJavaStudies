package utilities;

public class MathUtility {


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
