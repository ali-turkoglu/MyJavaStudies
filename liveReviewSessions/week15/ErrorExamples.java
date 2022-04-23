package week15;

public class ErrorExamples {
    /*
    Normally we do not try catch
     */
    public static void main(String[] args) {

        try {
            deathlyMethod();
        }catch (StackOverflowError e){
            System.out.println("StackOverflowError is handled");
        }


    }

    static int counter=0;

    public static void deathlyMethod(){
        System.out.println(counter++);
        deathlyMethod();
    }

}



