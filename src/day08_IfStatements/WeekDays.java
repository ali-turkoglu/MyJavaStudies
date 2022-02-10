package day08_SingleIf;

public class WeekDays {
    public static void main(String[] args) {
        int number = 2;

        if (number >0 && number < 2){
            System.out.println("Monday");
        }
        if (number >1 && number < 3){
            System.out.println("Tuesday");
        }
        if (number >2 && number < 4){
            System.out.println("Wednesday");
        }
        if (number >3 && number < 5){
            System.out.println("Thursday");
        }
        if (number >4 && number < 6){
            System.out.println("Friday");
        }
        if (number >5 && number < 7){
            System.out.println("Saturday");
        }
        if (number >6 && number < 8){
            System.out.println("Sunday");
        }
        if (number >7){
            System.out.println("Failed");
        }


    }
}
   /* write a program that can display the name of the day

        number = 1 ~ 7
        */