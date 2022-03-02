package day21_ArrayUtility_ForEachLoop;

public class ReverseName {
    public static void main(String[] args) {

        String [] classMates={"Ali Turs","Veli Kil","David Santra","Danish Kilm","Macro Yol"};

        for (String each : classMates) {

            String reversed="";
            for (int i=each.length()-1;i>=0;i--){

                reversed+=each.charAt(i);

            }
            System.out.println(reversed);
        }
    }
}
