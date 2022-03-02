package day18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {


            for (int j = 0; j < 5; j++) {
                System.out.println("Wooden Spoon");     // dış loop 5 kere ve herseferinde iç loop 5 kere
                                                        //döner. yani yazı 25 kere yazılır.
            }

        }


    }
}
