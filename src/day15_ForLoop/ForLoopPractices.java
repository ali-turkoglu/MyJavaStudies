package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {


        for (int i = 15; i <= 45; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("___________________________________________________");

        for (int i2 = 100; i2 >= 50; i2--) {      // i:100 , 99, 98 ......50
            System.out.print(i2 + " ");
        }
        System.out.println();

        System.out.println("________________________________________________________");

        for (int number = 1; number <= 55; number++) {     //print all the even numbers between 1-55
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }

        }
        System.out.println();

        System.out.println("____________________________________________________________");


        for (int number2=2;number2<=54;number2+=2){
            System.out.print(number2+" ");
        }
        System.out.println();

        System.out.println("________________________________________________________________");





    }

}
