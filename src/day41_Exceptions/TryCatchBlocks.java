package day41_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test started");


        try{
            System.out.println(9/0);
            System.out.println("Try Block");
        }catch (ArithmeticException e){
            System.out.println("Catch Block");
            System.out.println("Aritmetic Exception was occurred");
        }
      System.out.println("Test completed");

        System.out.println("--------------------------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1, 2, 3, 4};

        try {
            System.out.println(numbers[200]);
            System.out.println("try block");
        }catch (RuntimeException e){
            System.out.println("catch block");
        }



        System.out.println("Test2 completed");


    }
}
