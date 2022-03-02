package day16_ForLoop_String.tasks;

import java.util.Scanner;

public class CatEquelsDog {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String ");
        String str=input.nextLine().toLowerCase();
        int count1=0,count2=0;

        while(true) {

            if(str.contains("cat")){
                str=str.replaceFirst("cat","");
                count1++;
            }
            if(str.contains("dog")){
                str=str.replaceFirst("dog","");
                count2++;
            }
            if(!(str.contains("dog"))){
                break;
            }

            }
            if(count1==count2){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
    }
}
/*
    write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

        Ex:
        sentence = "caT dog dogG cAt"

        output:
        true
*/
