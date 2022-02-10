package day09_IfStatements;

import java.util.Scanner;

public class CharacterIdentity {
    public static void main(String[] args) {

        //Scanner input= new Scanner(System.in);
        char ch=88;

        if (ch>=48&&ch<=57){
            System.out.println("This is a number");
        }else if (ch>=65&&ch<=90||ch>=97&&ch<=122){
            System.out.println("This is a Alphabetic Character");
        }else{
            System.out.println("This is a Special Character");
        }


    }
}
