package day16_ForLoop_String;

public class UniqueCharacters {
    public static void main(String[] args) {

        String word="AABCCDEFFFG";
        String result="";

        for (int i = 0; i < word.length(); i++) { // i: index of word (starting from 0)

            if (word.indexOf(word.charAt(i))==word.lastIndexOf(word.charAt(i))) {
                result += word.charAt(i);
            }   // if the first and last index numbers are the same, that character is unique

        }
        System.out.println(result);

    }
}
