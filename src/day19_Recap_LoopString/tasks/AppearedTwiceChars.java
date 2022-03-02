package day19_Recap_LoopString.tasks;

public class AppearedTwiceChars {
    public static void main(String[] args) {

        String str="aabbbckccmmmddeeelllyimmkmyygghh";
        String result="";

        for (int i = 0; i < str.length(); i++) {

            int count=0;
            char ch=str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char each=str.charAt(j);
                if(ch==each){
                    count++;
                }

            }
            if(count==2){
                result+=ch;
                str=str.replaceAll(""+ch,"");
            }

        }
        System.out.println(result);
    }
}
