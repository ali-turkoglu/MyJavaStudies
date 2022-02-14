package week05;

import java.util.Scanner;

public class ReverseUsing_CharAt {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.next();
        //WRITE YOUR CODE HERE

        if(word.length()>5){
            System.out.println("Too long!");
        }else if(word.length()<5){
            System.out.println("Too short!");
        }else{
            System.out.println(word.charAt(4)+""+word.charAt(3)+""+word.charAt(2)+""+word.charAt(1)+""+word.charAt(0));
        }

        System.out.println("________________________________________________________________");

        System.out.println("enter second word has 5 char");
        String word2=scan.next();
        String reverseWord="";
        reverseWord+=word2.charAt(4);
        reverseWord+=word2.charAt(3);
        reverseWord+=word2.charAt(2);
        reverseWord+=word2.charAt(1);
        reverseWord+=word2.charAt(0);
        System.out.println(reverseWord);

        if (word2.equals(reverseWord)){
            System.out.println("word is palindrome");
        }else{
            System.out.println("word is not palindrome");
        }


    }
}
