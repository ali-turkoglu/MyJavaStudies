package day15_ForLoop;

public class ReverseResult {
    public static void main(String[] args) {

        String word="Java";
        String word2="";
        for (int i = word.length()-1; i >=0 ; i--) {
            word2 += word.charAt(i);
        }
        System.out.println(word2);
    }
}
