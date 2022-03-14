package week09;

public class Calculator {

    public static void main(String[] args) {

        System.out.println(add(56,65));

        double sum1 = add(4,6); // datatype parameter promotion: byte -> short -> int -> long -> double
        int sum2=(int)add(4,5);
        System.out.println(sum2);

        System.out.println("100*43= "+multiplication(100,43));

    }

    public static double add(double num1,double num2){
        double result=num1+num2;
        return result;
    }
    public static double subtract(double num1,double num2){
        return num1-num2;
    }

    public static double multiplication(double num1, double num2){
        return num1*num2;
    }

    public static double divide(double num1,double num2){
        return num1/num2;
    }


}
