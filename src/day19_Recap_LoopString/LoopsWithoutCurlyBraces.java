package day19_Recap_LoopString;

public class LoopsWithoutCurlyBraces {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            System.out.println("java");
            System.out.println("cydeo");

        }
        for (int i = 0; i < 5; i++)

            System.out.println("java");
            System.out.println("cydeo");


        //birden fazla statement varsa süslüparantez kullanmak zorundayız
        //eğer süslü parantez yoksa ilk statement loopa girer diğerleri loop dışında kalır.

    }
}
