package day16_ForLoop_String.tasks;

import java.util.Scanner;

public class FrequencyOfWord {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int count=0;

        for (int i = 0; i < str.length(); i++) {

            if(str.contains("java")) {
                str = str.replaceFirst("java", "");
                count++;

            }
        }
        System.out.println(count);
    }
}
/*write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create


 */