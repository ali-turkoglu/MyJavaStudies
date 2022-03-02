package day21_ArrayUtility_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String [] classMates={"Ali Turs","Veli Kil","David Santra","Danish Kilm","Macro Yol"};

        for (String each : classMates) {
            String initial=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1)+"."; //initial first character of each
            // word
            System.out.println(initial);
        }
    }
}
