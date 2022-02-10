package week03;

public class BitwiseOperators {
    public static void main(String[] args) {

        int  i1 =5;
        int i2 = 10;
        System.out.println(true | false); //true
        System.out.println( true || false); //true again but doesnot check the second part of the statement

        System.out.println(i2>i1 | i1>i2); //true

        System.out.println(i2>i1 || ++i1>i2);
        System.out.println("i1 = " + i1);       //5

        boolean a= i1<i2 && i2<i1;              //bitwise and operator; if the first satement
                                                //is false, does not check the second statement
        System.out.println("a = " + a); //false


    }
}
