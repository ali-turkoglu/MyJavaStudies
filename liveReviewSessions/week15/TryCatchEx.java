package week15;

public class TryCatchEx {
    public static void main(String[] args) {


        // I have to handle 2. one to print 3.
        System.out.println("10/2");
        try {
            System.out.println("10/0");
        }catch (RuntimeException e){

        }
        System.out.println("10/3");


    }
}
