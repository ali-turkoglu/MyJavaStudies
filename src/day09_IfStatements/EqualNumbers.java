package day09_IfStatements;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {

        System.out.println("Please enter 3 digits");
        Scanner input=new Scanner(System.in);
        int n1=input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();

        if (n1==n2&&n1==n3){
            System.out.println("all equal");
        }else if (n1==n2){
            System.out.println(n1+" and "+n2+" are equal");
        }else if (n2==n3){
            System.out.println(n2+" and "+n3+" are equal");
        }else if (n1==n3){
            System.out.println(n1+" and "+n3+" are equal");
        }else{
            System.out.println("none of them are equal");
        }
    }
}
