package day23_CustomMethods_Void.tasks;

public class DollarToEuro {

    public static void main(String[] args) {

        double dollar=3.5;

        System.out.println(dollarToEuro(dollar));


    }

    public static double dollarToEuro(double dollar){

        double result=dollar*0.91;
        return result;
    }

}
