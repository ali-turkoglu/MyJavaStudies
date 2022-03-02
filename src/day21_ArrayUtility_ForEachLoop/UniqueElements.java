package day21_ArrayUtility_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"java", "java", "C#", "python", "python","delphi"};


        for (String each : words) {
            int count=0;
            for (String word : words) {
                if (each.equals(word)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each+" is unique");
            }
        }

    }
}
