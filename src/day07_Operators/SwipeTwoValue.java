package day07_Operators;

public class SwipeTwoValue {
    public static void main(String[] args) {
        int a = 99;
        int b = 22;
        int c ;

        c = a;
        a = b;
        b = c;

        System.out.println("a is :" + a);
        System.out.println("b is :" + b);

    }

}
/*1. write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10

 */