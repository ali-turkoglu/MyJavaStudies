package day17_While_DoWhileLoop;

public class DoWhileLoopIntro {
    public static void main(String[] args) {

        boolean a=false;

        for (int i = 0; a ; i++) {
            System.out.println("woodenSpoon");  // a false olduğu için çalışmaz
        }

        while (a){
            System.out.println("woodenSpoon");
        }   //hiç bir zaman çalışmaz

        System.out.println("____________________________________");

        do {
            System.out.println("woodenSpoon");

        }while (a); // bir kere çalışır. a true olsaydı tekrar do statement çalışırdı.

    }
}
