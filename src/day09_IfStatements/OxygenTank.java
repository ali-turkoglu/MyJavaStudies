package day09_IfStatements;

public class OxygenTank {
    public static void main(String[] args) {

        int number=70;
        String message="";

        if (number==50){
            message="Be careful now you at 50%";
        }else if (number==60){
            message="Start to head back";
        }else if (number==70){
            message="Don't go too far";
        }else if (number==80){
            message="Still okay";
        }else{
            message="Your tank is full";
        }
        System.out.println(message);

    }
}
