package day27_WrapperClasses;

public class WrapperClasses_Methods {

    public static void main(String[] args) {


       // parse methods
        String str="123";
        int num1=Integer.parseInt(str); // primitives to primitives, its not autoboxing or unboxing

        System.out.println(str+1);  // 1231
        System.out.println(num1+1); //124

        String str2="2.3";
        double d1=Double.parseDouble(str2);
        System.out.println(d1);

        long maxLong=Long.MAX_VALUE;
        long minLong=Long.MIN_VALUE;
        System.out.println("minLong = " + minLong);
        System.out.println("maxLong = " + maxLong);

        String s1="TRue";
        boolean result=Boolean.parseBoolean(s1);    // true
        System.out.println(result);
        String s2="Maybe";
        boolean result2=Boolean.parseBoolean(s2);   // false
        System.out.println(result2);

        System.out.println("-----------------------------------------------");

        // valueOf methods

        String word="123";
        Integer x=Integer.valueOf(word);
        int y=Integer.valueOf(word);
        System.out.println("y = " + y);
        System.out.println("x = " + x);

        String word2="4.4";
        double z=Double.valueOf(word2); // arka planda unboxing yaptığından ekstra işlem vardır.
        Double v=Double.valueOf(word2);

        // isDigit()

        char ch='9';
        boolean r=Character.isDigit(ch); // true
        System.out.println("r = " + r);

        // isLetter()

        char ch2='A';
        boolean r2=Character.isLetter(ch2);
        System.out.println("r2 = " + r2);

        // special char

        boolean r3=!Character.isLetterOrDigit(ch2); //  with  !  operator we can find if it is specia char or not
        System.out.println("r3 = " + r3);

        // isUpperCase

        boolean r5=Character.isUpperCase(ch2);
        System.out.println("r5 = " + r5);    //  'A' true

        // isLowerCase

        boolean r6=Character.isLowerCase(ch2);
        System.out.println("r6 = " + r6);    // 'A'  false

        System.out.println("--------------------------" );


        String s="ab2cd4ef1m9cile7";

        int sum=0;

        for (char each: s.toCharArray()){
            if (Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);
    }
}
