package day08_SingleIf;

public class NameOfTheMonth {
    public static void main(String[] args) {
        int number = 4;

        if (number >0 && number<2){
            System.out.println("January");
        }
        if (number >1 && number<3){
            System.out.println("February");
        }
        if (number> 2 && number<4){
            System.out.println("March");
        }
        if (number >3 && number<5){
            System.out.println("April");
        }
        if (number >4 && number<6){
            System.out.println("May");
        }
        if (number >5 && number<7){
            System.out.println("June");
        }
        if (number >6 && number<8){
            System.out.println("July");
        }
        if (number >7 && number<9){
            System.out.println("August");
        }
        if (number >8 && number<10){
            System.out.println("September");
        }
        if (number >9 && number<11){
            System.out.println("October");
        }
        if (number >10 && number<12){
            System.out.println("November");
        }
        if (number >11 && number<13){
            System.out.println("December");
        }
        if (number >12 ){
            System.out.println("Failed");
        }

    }

}

/*
1. write a program that can display the name of the month

        number = 1 ~ 12
        */
