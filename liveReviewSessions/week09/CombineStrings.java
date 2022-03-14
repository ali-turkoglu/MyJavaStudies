package week09;

public class CombineStrings {

    public static void main(String[] args) {

        //System.out.println(combineString("java","python"));

        String str=combineString("java","fun");
        System.out.println(str);

    }

    public static String combineString(String str1,String str2){
        String result="";

        int biggestSize=0;
        if (str1.length()>str2.length()) {
            biggestSize = str1.length();
        }else{
            biggestSize= str2.length();
        }

            for (int i = 0; i < biggestSize; i++) {
                if (i<str1.length()){
                    result+=str1.charAt(i);
                }
                if (i<str2.length()){
                    result+=str2.charAt(i);
                }
        }
        return result;
    }
}
