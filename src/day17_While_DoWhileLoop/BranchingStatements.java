package day17_While_DoWhileLoop;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[]args){

        for(char ch='A'; ch<='Z'; ch++){

            if(ch=='E'){
                break;      // exit the loop
            }

            System.out.print(ch+" ");
        }
        System.out.println("_______________________________________________");

        Scanner input=new Scanner(System.in);

        while (true){

            System.out.println("Enter a number:");
            int num=input.nextInt(); // if user enter negative number how can we break

            if (num<0){
                break;
            }

        }


    }
}
