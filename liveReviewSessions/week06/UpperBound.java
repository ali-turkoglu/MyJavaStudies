package week06;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=input.nextInt();
        int total=0;
        boolean check=true;

        for ( ;check ; ) {          // repeatable if statement. check is true go on till check is false

            if (number > 0) {
                for (int i = 1; i <= number; i++) {
                    total += i;

                    if (i == number) {
                        System.out.print(i);
                    } else {
                        System.out.print(i + "+");
                    }
                }
                System.out.print("=" + total);
                check = false;
            } else {
                System.out.println("Please enter a valid number");
                number = input.nextInt();
               // check = true;
            }


        }
    }
}
