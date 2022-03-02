package day19_Recap_LoopString;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i==3){
                //break;
                //continue;
                System.exit(0);
            }
            System.out.println(i);

        }

        System.out.println("Wooden Spoon");
    }
}
