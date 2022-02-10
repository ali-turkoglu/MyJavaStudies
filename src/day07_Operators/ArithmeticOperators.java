package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int num1 = 29;
        int num2 = 3;

        int division = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Bölünen = " + num1);
        System.out.println("Bölen   = " + num2);
        System.out.println("Sonuç   = " + division);
        System.out.println("Kalan   = " + remainder);
        System.out.println();

        System.out.println(num1 +" equal to "+ ((division * num2)+remainder));
        //10 divide by 3 equal to 3 with a remainder of 1

        System.out.println("------------------------------------------");

        System.out.println( 25 % 4 );

        System.out.println( 25 % 5);

        System.out.println("--------------------------------------------");

        int ab= 25;
        System.out.println(++ab);   //26
        System.out.println(--ab);   //25
        System.out.println(ab++);   //25
        System.out.println(ab--);   //26
        System.out.println(ab);     //25

        int z = 5;
        ++z;        //pre increment : increases the value by right away, immediately
        System.out.println("pre increment : "+ z); //6

        int t= 5;
        --t;        //pre decrement : decreases the value by right away
        System.out.println(t); //4

        System.out.println("----------------------------------------");

        int x = 5;
        System.out.println("post increment 1.step :" + x++);
        System.out.println("post increment 2.step :"+x);

        int q = 30;

        System.out.println(--q);        // 29 --->  q = 29
        System.out.println(q--);        // 29 --->  q = 28
        System.out.println(q);          // 28

    }

}
