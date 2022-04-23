package week15.checkedExceptionDemo;

public class checkExceptionDemo {

    public static void main(String[] args) throws InterruptedException {

        // Thread.sleep(3000); --> throws or causes an InterruptedException, checked exception

        // 1
        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }

        System.out.println("I will move on with my web automation");

        // 2

        Thread.sleep(3000);  // we add throws in methods signature
        System.out.println("More automation after 5 more seconds");

    }
}
