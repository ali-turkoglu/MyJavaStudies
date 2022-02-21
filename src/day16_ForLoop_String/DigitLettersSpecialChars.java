package day16_ForLoop_String;

public class DigitLettersSpecialChars {
    public static void main(String[] args) {

        String word="Cydeo234.l mkhn)(')%(";
        String letters="";
        String digits="";
        String symbols="";

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i)>='0'&& word.charAt(i)<='9'){
                digits+=word.charAt(i);
            }else if (word.toLowerCase().charAt(i)>='a'&&word.toLowerCase().charAt(i)<='z'){
                letters+=word.charAt(i);
            }else{
                if (word.charAt(i)!=' ') {          //space i yazdırmak istemiyorsak bu şartı ekleriz.
                    symbols += word.charAt(i);
                }
            }

        }
        System.out.println("symbols = " + symbols);
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);

    }
}
