package day16_ForLoop_String;

public class ReversingString {
    public static void main(String[] args) {
        String word="Wooden Spoon";
        String word2="";

        for (int i = word.length()-1; i >=0 ; i--) {

            //char ch=word.charAt(i);
            word2+=word.charAt(i);
            //System.out.println(word2);
        }
        System.out.println(word2);
    }
}
/*
Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */