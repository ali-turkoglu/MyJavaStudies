package week09;

public class CustomMethodPractice {

    public static void main(String[] args) {

        int personOneAge=10;
        if (personOneAge>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
        int personTwoAge=20;
        if (personTwoAge>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        int personThreeAge=30;
        if (personThreeAge>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
        System.out.println("===============================================================");

        personEligible(45);
        personEligible(15);
        personEligible(4);
        personEligible(25);

    }

    public static void personEligible(int age){
        if (age>=21){
            System.out.println("Age "+age+" is eligible");
        }else{
            System.out.println("Age "+age+" is not eligible");
        }
    }
}
