package week15.CustomExceptions;

public class CustomExceptionTest {
    public static void main(String[] args) {

        int minutes=70;
        System.out.println("Class is going on for "+minutes+" minutes");
        if (minutes>50){
            throw new BreakTimeException("It is break time");
        }

        System.out.println("Let's continue the class another "+(50-minutes)+" minutes");

        System.out.println("-------------------------------------");

        double balance=333;
        double itemPrice=444;
        System.out.println("I have "+balance+" Euros in my account the item is "+itemPrice);

        if (itemPrice>balance){
            throw new InsufficientBalanceException("Transaction d");
        }

    }
}
