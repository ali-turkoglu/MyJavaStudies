package day20_Arrays;

public class UniqueElement {
    public static void main(String[] args) {

        String[] words = {"java", "java", "C#", "python", "python","delphi"};

        for (int i = 0; i < words.length; i++) {

            String element=words[i];
            int frequency=0;

            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(element)) {
                    frequency++;
                }
            }
            //System.out.println(words[i]+" is "+frequency+" times occur");
            if (frequency==1){
                System.out.println(words[i]+" is unique");
            }
        }


    }
}
