package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
//---------------------------------------------
// b ye atama yapılınca eski bilgisi gideceği için
// geçici olarak başka bir variable üzerinde muhafaza ediyoruz.

        int c = b;
        b = a;
        a = c;

//-------------------------------------------------------------
        System.out.println("a = " + a);
        System.out.println("b = " + b);





    }
}
