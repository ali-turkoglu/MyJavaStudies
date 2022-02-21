package day17_While_DoWhileLoop;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("____________________________________________________");

        int num=1;
        while (num<11){
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
        System.out.println("____________________________________");

        int num2=1;
        do {
            System.out.print(num2+" ");
            num2++;
        }while (num2<11);

    }
}
