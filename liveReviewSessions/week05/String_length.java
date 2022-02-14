package week05;

public class String_length {

    public static void main(String[] args) {

        String message="EU8 is Awesome!!";
        System.out.println(message.length()); // 16 char in message
        System.out.println(message.lastIndexOf("!")); //last char index number is 15

        System.out.println(message.toUpperCase()); // EU8 IS AWESOME!!


        String str1="    ab   cd   ";
        System.out.println(str1.trim()); //ab   cd

        String str2= "   abc  cde  ";
        System.out.println(str2.replaceAll(" ",""));
        System.out.println(str2.replace(" ",""));

        String str3=" EU8 Awesome ";
        System.out.println(str3.replaceFirst(" ",""));
        System.out.println(str3.trim());
        System.out.println(str3.replaceAll(" ",""));
        System.out.println(str3.replace(" ",""));

        System.out.println(str3.trim().replace(" ","").toUpperCase().substring(3));


    }
}
