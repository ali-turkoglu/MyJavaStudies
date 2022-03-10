package day23_CustomMethods_Void.tasks;

import java.util.Scanner;

public class CalculateGrade {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your score");
        calculateGrade(scan.nextInt());

    }


    public static void calculateGrade(int score){

        String result="";
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
/*create a method that can calculate the grade of the student based on the score

 */