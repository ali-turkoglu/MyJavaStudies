package day24_CustomMethod_Return.tasks;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String str="aaabbbbbbccddddefff";

        String str2=removeDuplicate(str);
        System.out.println(str2);

    }

    public static String removeDuplicate(String str){

        String result="";
        for (int i = 0; i < str.length(); i++) {
            char eachChar=str.charAt(i);
            if (!(result.contains(""+eachChar))){
                result+=eachChar;
            }
        }
        return result;
    }



}
/*reate a method that can remove duplciated characters from a string and returns the new value
					"aaabbcccc" ===> "abc"

 */