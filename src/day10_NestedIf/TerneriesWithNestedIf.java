package day10_NestedIf;

import java.util.Scanner;

public class TerneriesWithNestedIf {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter Your Score:");
        int s=input.nextInt(); //score

        String result=(s>=0 &&s<=100)?
                (s>=90)?"Excellent":(s>=80)?"Great":(s>=70)?"Good":(s>=60)?"Passed":"Failed"
        :"Invalid Score";

        System.out.println(result);


    }
}
