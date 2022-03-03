package day14_String.task;

import java.util.Scanner;

public class MergeTwoWords {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        String word2=scan.next();

        String result="";

        for (int i = 0; i < word.length(); i++) {
            result+=word.charAt(i);
        }
        int i=0;
        if (word.charAt(word.length()-1)==word2.charAt(0)){
            i=1;
        }
        for (  ; i < word2.length(); i++) {

            result+=word2.charAt(i);
        }
        System.out.println(result);

    }
}
/*    Ask user to enter two words. Then add them together and print.
        But if the last letter if the first word and the first letter of the last letter is the same,
        print that character once.

        Input:
        one
        eight
        Output:
        oneight*/