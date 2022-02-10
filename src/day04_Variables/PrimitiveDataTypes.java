package day04_Variables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        //integer: age, year, salary, miles

        byte age = 45;
        short year = 2022;
        int salary = 888888888 ; //in java int is preferred by the compiler
        long miles= 6666666669999999l; /* long tanımı yapmış olsak bile int den uzun bir sayı yazdığımız zaman
                                            compiler i forcelamak için numaraların sonuna l veya L koymamız gerekir.
                                            yoksa numaramız int in alacağı en büyük değerden
                                            büyük diye hata verir.
                                        */

        //decimals: tax, pi

        double $tax=0.55; // preferred
        float pi=3.14f;

        // symbols : @, #

        char ch1 = '@';
        char ch2 = '#';


        System.out.println(age);
        System.out.println(year);
        System.out.println(salary);
        System.out.println(miles);
        System.out.println($tax);
        System.out.println(pi);
        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("-------------------------------------------------------------------------");

       // boolean result1 = true ;
       // boolean result2 = false;
        boolean result3 = 5 > 10 ;

        System.out.println(result3);

        System.out.println("----------------------------------------------------------------------");

        int a = 100;
        int b = 200;

        boolean aisgreaterthanb = a>b;

        System.out.println(aisgreaterthanb);
    }

}
