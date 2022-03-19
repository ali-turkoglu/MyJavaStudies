package day27_WrapperClasses.tasks;

public class RetrievesFromString {

    public static void main(String[] args) {

        String word="Wooden Spoon!88";
        retrieve(word);
        System.out.println("-----------------------------------------------------");
        retrieve2(word);

    }

    // retrieve the letters, digits and special characters from the string and print all
    public static void retrieve(String str){

        String letters="";
        String digits="";
        String specialChars="";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='A'&&str.charAt(i)<='Z'||str.charAt(i)>='a'&&str.charAt(i)<='z'){
                letters+=str.charAt(i);
            }else if (str.charAt(i)>='0'&&str.charAt(i)<='9'){
                digits+=str.charAt(i);
            }else{
                specialChars+=str.charAt(i);
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }

    public static void retrieve2(String str){

        String letters="";
        String digits="";
        String specialChars="";

        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            if (Character.isDigit(each)){
                digits+=each;
            }else if (Character.isLetter(each)){
                letters+=each;
            }else{
                specialChars+=each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }


}
/*Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";



 */