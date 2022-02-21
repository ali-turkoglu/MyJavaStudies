package day17_While_DoWhileLoop;

public class RemoveDublicates {
    public static void main(String[] args) {



    String str="AAAABBCC";

    String result="";
        for (int i = 0; i < str.length(); i++) {
            String ch=""+str.charAt(i);//"A" "A" "A" "A" "B" "B" "C" "C"

            if (result.contains(ch)){
                continue;
            }
            result+=ch;
        }
        System.out.println(result); //ABC
    }
}