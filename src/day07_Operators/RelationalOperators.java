package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >, >=, <, <=

        boolean result1 = 20 > 40;
        System.out.println("result1 = " + result1);     //false

        boolean result2 = 30 >= 150;
        System.out.println("result2 = " + result2);     //false

        boolean result3 = 100 >= 100;
        System.out.println("result3 = " + result3);     //true

        System.out.println("-------------------------------");

        // credit score of 720
        int score = 700;
        boolean isEligible = score >= 720;
        //System.out.println("isEligible = " + isEligible);
        if (score >= 720) {
            System.out.println("Puanınız krediye uygundur");
        }
        else {
            System.out.println("Puanınız krediye uygun değildir.");
        }

        System.out.println("----------------------------------------");

        boolean result4 = 100<200;
        System.out.println("result4 = " + result4);  //true

        boolean result5 = 222 <= 111;
        System.out.println("result5 = " + result5);

        int score2 = 59;
        boolean hasFailed = score2 <= 59;
        System.out.println("hasFailed = " + hasFailed);     //true

        boolean result6 = "Muhtar" == "Good Guy" ; //false
        System.out.println("result6 = " + result6);

        boolean result7 = 'A' == 'a';   //false
        System.out.println("result7 = " + result7);

        boolean result8= " java " =="java  ";
        System.out.println("result8 = " + result8);     //false

        boolean result9 = 100 !=200.5;  //true
        System.out.println("result9 = " + result9);

        boolean result10 = "java" != "Break";   //true
        System.out.println("result10 = " + result10);

        boolean result11 = 300!=300;        //false
        System.out.println("result11 = " + result11);













    }

}
