package day10_NestedIf;

public class DaysInWeek_Ternaries {

    public static void main(String[] args) {

        int n = 5; // 1 - 7
        String day= (n==1)?"Monday":(n==2)?"Tuesday":(n==3)?"Wednesday"
                :(n==4)?"Thursday":(n==5)?"Friday":(n==6)?"Saturday":(n==7)?"Sunday":"Invalid";
        System.out.println(n+". day = " + day);

    }
}
