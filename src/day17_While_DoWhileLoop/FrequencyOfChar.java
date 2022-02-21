package day17_While_DoWhileLoop;

public class FrequencyOfChar {
    public static void main(String[] args) {


        String word="AAAAAABBBCDDDAA";
        char ch='A';
        int frequency=0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)==ch){
                frequency++;
            }

        }
        System.out.println(frequency);
    }
}
/*Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3


 */