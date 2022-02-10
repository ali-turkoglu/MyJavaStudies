package week02;

public class PrimitivesExample {
    public static void main(String[] args) {
        /*
        DataType variableName = Value  // Declare and initialize at the same line

        DataType variableName;  //  Declaring a variable
        variableName = value;   //  Initializing a variable, assigning a value

        DataType variableNameOne, variableNameTwo;

         */

        byte num1;  // Declaring a variable

        num1 = 123; // Initializing a variable, assigning a value
        num1 = 22; // re-assigning a value

        short num2 = 12345; // Declaring and Initializing it the same line
        int distance= 1_000_000_000;
        long distanceMore = 3_000_000_000_000L; // we have to put l/L to define the variable

        float rate = 1000.5f;  // we have to put f/F to define the variable
        double dNumber = 123.6;

        System.out.println("--------------castings----------------");

        //  NEM   Narrowing Explicit Manually

        System.out.println("Before Casting");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num2 = num1;
        System.out.println("After swapping");
        System.out.println("num2 = " + num2);

        System.out.println("---------Expilicit Casting--------------");

        num2 = (short)distance; // narrowing, we have to do manually, I can lose date
        System.out.println("num2 = " + num2);

        System.out.println(" Explicit casting of floating points");






    }


}
