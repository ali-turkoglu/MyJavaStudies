package week07;

public class WhileHungary {

    public static void main(String[] args) {

        boolean isHungary=true;
        int bananas=0;
        int countToFull=3;

        while (isHungary){
            bananas++;
            System.out.println("Eating a banana: \uD83C\uDF4C "+bananas);   //unicodes

            if(countToFull==bananas){
                isHungary=false;
                // break;  ====> branching statement
            }
        }

        System.out.println("Had enough bananas, lets get back to study");
    }
}
