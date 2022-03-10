package day24_CustomMethod_Return;

public class ReturnMethodPractice3 {

    public static void main(String[] args) {

        // find frequency
        String str = "aabccdeefgghhhhii";

        for (int i = 0; i < str.length(); i++) {
            int frequency=frequency(str,str.charAt(i));
            if (frequency==1){
                System.out.println(str.charAt(i)+" is unique character");
            }
        }
    }


    public static int frequency(String str, char ch) {

        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == ch) {
                count++;
            }
        }
        /*
        for(char each:str.toCharArray()){
            if(each==ch){
            count++;
            }
        }
        */

        return count;

    }
}
