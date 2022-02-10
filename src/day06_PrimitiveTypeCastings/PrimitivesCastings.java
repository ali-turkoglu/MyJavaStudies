package day06_PrimitiveTypeCastings;

public class PrimitivesCastings {
    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        //short un range i byte den büyük olduğu için complier hata vermedi.
        //arka planda complier otomatik (short)a yazdı

        int c = (int)b;     // parantez içerisindekini yazamayadabiliriz.

        long d = c;
        float e= d;
        double  f = e;

        System.out.println("---------------------------------------");


        int x = 555;
        short y = (short)x;
        byte z = (byte)x;

        System.out.println( x+" : "+y); // 555 short u kapsadığı için değer değişmedi
        System.out.println(z);
        // 555 byte değerinin üzerinde olduğu için 8 bit de yazılı değeri gösterdi . O da 43

        double l = 2.5;
        float m = (float)l;
        System.out.println(l+" : "+m);

        double n = 10.8;
        int p= (int)n;

        System.out.println(n +" : " + p);

        //int sadece integer gösterdiği için double ın sadece noktadan sonraki kısmını gösterir.

        double d1 = 20.55;
        short s1 = (short) d1; // noktalı virgül sonrası Alt+Enter ile casted yaptım
        System.out.println(d1+" : "+s1);







    }


}
