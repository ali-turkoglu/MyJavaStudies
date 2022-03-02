package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {

        char[] chars={'A','A','A','B','C','C','D','D','F'};

        for (int i = 0; i < chars.length; i++) {

            int frequency=0;

            for (int i1 = 0; i1 < chars.length; i1++) {
                if (chars[i]==chars[i1]){
                    frequency++;
                }

            }
            if (frequency==2){
                System.out.println(chars[i]+" occurs twice");
            }
        }

    }
}
