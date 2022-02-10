package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {

        int n = 8; // 1 - 7
        String day="";

        if (n==1){
            //System.out.println("Monday");
            day="Monday";
        }else if (n==2){
            //System.out.println("Tuesday");
            day ="Tuesday";
        }else if (n==3){
            //System.out.println("Wednesday");
            day ="Wednesday";
        }else if (n==4){
            //System.out.println("Thursday");
            day = "Thursday";
        }else if (n==5){
            //System.out.println("Friday");
            day="Friday";
        }else if (n==6){
            //System.out.println("Saturday");
            day="Saturday";
        }else if (n==7){
           // System.out.println("Sunday");
            day="Sunday";
        }else{
            System.out.println("Invalid");
        }
        System.out.println(n+". day = " + day);
    }
}
