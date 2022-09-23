package test;

import java.util.Arrays;
import java.util.Locale;

public class Frequency {

    public static void main(String[] args) {

        String str="Wooden Spoon";
        String result="";

        for (char each1 : str.toLowerCase().toCharArray()) {

            int count=0;

            for (char each2 : str.toLowerCase().toCharArray()) {

                if (each1==each2){
                    count++;
                }
            }

            if (!(result.contains(""+each1)||each1==' ')){
                result += ""+each1 + count;
            }
        }
        System.out.println("result = " + result);

        //_____________Second Way__________________________________

        String result2="";

        for (int i = 0; i < str.length(); i++) {

            int count=0;

            for (int j = 0; j < str.length(); j++) {

                if (str.toLowerCase().charAt(i)==str.toLowerCase().charAt(j)){
                    count++;
                }
            }
            if (!(result2.contains(""+str.toLowerCase().charAt(i))||str.charAt(i)==' ')){
                result2+=""+str.toLowerCase().charAt(i)+count;
            }
        }
        System.out.println("result2 = " + result2);

        //__________Third Way______________________________________

        String result3="";

        char [] strCh=str.toLowerCase().toCharArray();

        Arrays.sort(strCh);

        for (char each1 : strCh) {

            int count=0;

            for (char each2 : strCh) {

                if (each1==each2){
                    count++;
                }
            }

            if (!(result3.contains(""+each1)||each1==' ')){
                result3 += ""+each1 + count;
            }
        }
        System.out.println("result3 = " + result3);
    }
}
