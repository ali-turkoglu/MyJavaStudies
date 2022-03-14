package day24_CustomMethod_Return.tasks;

public class Palindrome {

    public static void main(String[] args) {

        String str="Level";
        boolean isPalindrome=palindrome(str);
        System.out.println(isPalindrome);

    }

    public static boolean palindrome(String word){

        word=word.toLowerCase();
        String reverse="";
        boolean result=false;

        for (int i = word.length()-1; i >= 0; i--) {
            reverse+=word.charAt(i);
        }
        if (word.equals(reverse)){
            result=true;
        }
        return result;
    }
}
/*By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true


 */