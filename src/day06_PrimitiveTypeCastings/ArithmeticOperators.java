package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println( 10+20);     //Addition
        System.out.println("10"+20);    //Concatenation

        System.out.println(100-50);
        System.out.println(10*6);

        int a = 100;
        double b = a/6;        // double kaynağı int/int olduğundan decimal dönüş olmaz.
        System.out.println(b); // 16.0

        double c = a/6.0;
        System.out.println(c);  //16.666666666666668

        double d = (double) a / 6;
        System.out.println(d);   //16.666666666666668

        double e = a/6d;
        System.out.println(e);  //16.666666666666668


    }

}
/*

    +  Addition
    -  Subtract
    *  Multiplication
    /  Division  --->   integer / integer  =  integer
                        decimal / integer  =  decimal
                        integer / decimal  =  decimal
                        decimal / decimal  =  decimal

    in math 10  / 4   = 2.5

    in java
                                10  / 4   = 2    (prefered int in java)
                                10.0/ 4   = 2.5
                                10  / 4.0 = 2.5
                        (double)10  / 4   = 2.5
                                10d / 4   = 2.5
    %  Module

 */