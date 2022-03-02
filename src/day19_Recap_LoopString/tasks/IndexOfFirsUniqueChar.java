package day19_Recap_LoopString.tasks;

public class IndexOfFirsUniqueChar {
    public static void main(String[] args) {

        String str="bbbccccddeef";
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=0;

            for (int j = 0; j < str.length(); j++) {
                char each=str.charAt(j);
                if(ch==each){
                    count++;
                }

            }
            if (count==1){
                System.out.println(ch+" is the first unique char");
                break;
            }
        }
    }
}
