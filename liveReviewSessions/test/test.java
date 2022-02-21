package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String word2="";

        if( word.toLowerCase().charAt(0)=='x'){
            word2=word.substring(1);
        }else if(word.toLowerCase().charAt(0)=='x'&&word.toLowerCase().charAt(word.length()-1)=='x'){
            word2=word.substring(1,word.length()-1);
        }else if(word.toLowerCase().charAt(word.length()-1)=='x'){
            word2=word.substring(0,word.length()-1);
        }

        System.out.println(word2);



    }

}
