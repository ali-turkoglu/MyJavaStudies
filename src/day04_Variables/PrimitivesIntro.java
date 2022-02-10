package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        // age: 45 years old
        byte age = 45;

        //weight : 160 pounds
        //byte weight = 160; ---------->  160 is out of byte's range
        short weight=160;

        //salary: 100000 $
        //short salary = 100000; ---------->  out of short' range, use int
        int salary = 100000; // prefered DataType in java

        // asset: 3_333_333_333  we have to use long DataType
        long asset = 3_333_333_333L ; //int is prefered type, to force the complier use L/l end of data

        // tax: 0.26
        float tax = 0.26F; // to force the complier write F/f end of the data
        double pi = 3.14; // double is the prefered type by java


        // #
        char ch1 ='#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;      //char da ASCII tablosu karakter numaraları ile tanımlama yapılabilir.
        System.out.println("ch2 = " + ch2);

        char ch3 = 4154;
        System.out.println("ch3 = " + ch3);

        char gender = 'M';
        char yesNo ='Y';

        // boolean is use only true/false
        boolean isEmployeed = true;
        boolean isMarried = false;

        boolean result = 100>300; // boolean aynı zamanda dogru yanlış sonuc dönüşünüde yapar.
        System.out.println("result = " + result);
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployeed = " + isEmployeed);

        // String is sequences of characters, is non-primitive
        //  if we use more than 1 character, we use String.
        String name = "Wooden Spoon";
        String city = "Ankara";

        System.out.println("name = " + name);
        System.out.println("city = " + city);






    }

}
