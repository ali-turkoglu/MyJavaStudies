package day11_SwitchScanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Calculator;\n");
        Scanner input=new Scanner(System.in);
        double n1=input.nextDouble();
        String operator=input.next();
        double n2=input.nextDouble();
        double total=0;

        switch (operator){
            case "+":
                total=n1+n2;
                System.out.println(n1+"+"+n2+"="+total);
                break;
            case "-":
                total=n1-n2;
                System.out.println(n1+"-"+n2+"="+total);
                break;
            case "/":
                total=n1/n2;
                System.out.println(n1+"/"+n2+"="+total);
                break;
            case "*":
                total=n1*n2;
                System.out.println(n1+"*"+n2+"="+total);
                break;
            default:
                System.out.println("Invalid operator");


        }


    }
}
