package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        for (char a='A';a<='Z';a++){
            System.out.print(a+" ");
        }
        System.out.println();

        System.out.println("_____________________________________________________________");

        for (char b='a';b<='z';b++){
            System.out.print(b+" ");
        }
        System.out.println();

        System.out.println("______________________________________________________________");

        for (char c='Z';c>='A';c--){
            System.out.print(c+" ");
        }
        System.out.println();


        System.out.println("______________________________________________________________");

        for (char d='z';d>='a';d--){
            System.out.print(d+" ");
        }
        System.out.println();

        System.out.println("_________________________________________________________________");

        for (char i=1;i<=40000;i++){
            System.out.print(i);
        }

        System.out.println();

        System.out.println("____________________________________________________________________");



    }
}
