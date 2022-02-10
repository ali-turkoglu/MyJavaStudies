package day04_Variables;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {

        //implicit casting ----> daha küçük data tipini daha büyük bir data tipine çevirmeye denir.

        byte a= 25;
        int b= a;   // this  is implicit casting    bu kodun anlamı       int b= (int)a
        double d=a;  //  ------->  double d=(double)a; this is implicit casting


        short x = 1000;
        long y= (long)x;  //this is also implicit casting


        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println();
        System.out.println(x);
        System.out.println(y);
        System.out.println();
        System.out.println("---------------------------------------------------------------");

        //explicit casting ------->  it is opposite of implicit casting. Casting larger primitive type to smaller one

        // it is not working automatically. you must do manually

        int e=100;
        byte f=(byte)e;   // int is larger than byte as a data type not the value

        long m=2000;
        short p=(short)m;

        System.out.println();
        System.out.println(e);
        System.out.println(f);
        System.out.println();
        System.out.println(m);
        System.out.println(p);
        System.out.println();


        double k= 25.5;
        int l=(int)k;               //25.5 burada 25 oluyor. yani casting explicit
        System.out.println(k);
        System.out.println(l);


    }

}
