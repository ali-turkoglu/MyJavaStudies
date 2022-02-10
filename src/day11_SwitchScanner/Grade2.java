package day11_SwitchScanner;

public class Grade2 {
    public static void main(String[] args) {

        char ch='D';

        switch (ch){

            case 'A':

            case 'B':

            case 'C':

            case 'D':
                System.out.println("Passed");
                break;

            default:
                System.out.println("Failed");
        }

    }
}
/*
if the grade is a, b, c, d  =====> passed
otherwise===> failed
 */