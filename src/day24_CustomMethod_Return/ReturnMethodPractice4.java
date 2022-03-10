package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {

    public static void main(String[] args) {

        String str="aaaabbbcddddeeef";

        String str2=removeDuplicates(str);

        System.out.println(str2);

        String word ="aaammmmllllyyylllnnnklimkeahngnulmmmmlmklmllllieaknh";
        System.out.println(removeDuplicates(word));


    }

    // create a method that can remove duplicated char from a string and returns the new value
    public static String removeDuplicates(String str){

        String result="";
        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            if (!(result.contains(""+each))){
                result+=each;
            }
        }
        return result;
    }


}
