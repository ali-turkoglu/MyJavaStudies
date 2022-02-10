package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n=100;

        if (n%2==0){
            System.out.println("Even"); //String
        }else{
            System.out.println("Odd");  //String
        }

        System.out.println("________________________________");

        String result = (n%2==0)? "Even" : "Odd" ;

        System.out.println("_____________________");

        int age=23;
        String isEligible=(age>=21)?"Eligible" : "Not eligible";
        System.out.println(isEligible);


        System.out.println("____________________________________");

        int number=-00;

        if (number>0){
            System.out.println("Positive");
        }else if (number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        String result1=(number>0)?"Positive" :(number<0)? "Negative" : "Zero";
        System.out.println(result1);

    }


}
