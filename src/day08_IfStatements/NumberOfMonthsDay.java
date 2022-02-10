package day08_SingleIf;

public class NumberOfMonthsDay {
    public static void main(String[] args) {
        int number = 7;

        boolean days28 = number==2;
        boolean days30 = number==4 || number==6 ||number==9||number==11;
        boolean days31 = number==1|| number==3|| number==5||number==7||number==8||number==10||number==12;


        if (days28){
            System.out.println("This month has 28 days.");
        }
        if (days30){
            System.out.println("This month has 30 days.");
        }
        if (days31){
            System.out.println("This month has 31 days.");
        }


    }
}
  /*  rite a program that can print the number of days in a month

        Ex:
        number = 1 ~ 12;

        output:
        31 Days

        Hints:
        Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
        Months that has 30 days: 4, 6, 9, 11
        Month that has 28 days: 2
        */