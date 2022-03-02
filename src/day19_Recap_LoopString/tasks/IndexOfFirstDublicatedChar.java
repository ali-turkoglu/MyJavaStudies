package day19_Recap_LoopString.tasks;

public class IndexOfFirstDublicatedChar {
    public static void main(String[] args) {

        String str="abbbccccddeef";
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
            if (count==2){
                System.out.println(str.indexOf(ch)+" is the first dublicated char's index number");
                break;
            }
        }
    }
}
