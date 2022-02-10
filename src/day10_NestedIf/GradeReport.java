package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        int score = 65;


       /* if (score <=100 && score>=0) {

            if (score >= 90) {
                System.out.println("Excellent");
            } else if (score >= 80 ) {
                System.out.println("Great");    //bu satıra geldiğine göre üst satırlar false. bu yüzden 80 den küçük yazmama gerekyok. 80 den büyük olsaydı zaten üst satırlar işletilirdi.
            } else if (score >= 70 ) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        }else{
            System.out.println("Invalid Score");
        }
        */

        String result;  //temporary

        if (score <=100 && score>=0) {

            if (score >= 90) {
                result="Excellent";
            } else if (score >= 80 ) {
                result="Great";    //bu satıra geldiğine göre üst satırlar false. bu yüzden 80 den küçük yazmama gerekyok. 80 den büyük olsaydı zaten üst satırlar işletilirdi.
            } else if (score >= 70 ) {
                result="Good";
            } else if (score >= 60) {
                result="Passed";
            } else {
                result="Failed";
            }

        }else{
            result="Invalid Score";
        }
        System.out.println(result);


    }
}
/*
92 - 100 excelent
80 - 89 great
70 - 79 good
60 - 69 passed
0  - 59 failed
 */