package day24_CustomMethod_Return.tasks;

public class Reverse {

    public static void main(String[] args) {

        String word="java";
        word="Ali";
        System.out.println(word);





    }

    public static String reverse(String str){

        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=""+str.charAt(i);
        }
        return result;
    }

   /*public static String reverse(String word){



        for (int i = 0; i < word.length()/2; i++) {
            char temp=word.charAt(i);
            word.charAt(i)=word.charAt(word.length()-1-i);
            word.charAt(word.length()-1-i)=temp;
        }
        return word;
    }*/
}
/*create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ


 */