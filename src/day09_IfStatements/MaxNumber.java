package day09_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {
        int a = 54;
        int b = 54;

        if (a>b){
            System.out.println(a+ " is maximum number");
        }  else if (b>a){
            System.out.println(b+" is maximum number");
        } else {
            System.out.println("The numbers are equals");
        }

    }
}
