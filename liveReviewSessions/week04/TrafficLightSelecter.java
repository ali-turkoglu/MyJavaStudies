package week04;

public class TrafficLightSelecter {
    public static void main(String[] args) {

        char color='R';

        switch (color){
            case 'R': case'r':      //or logic
                System.out.println("Red Light");
                break;
            case 'G': case 'g':     //or logic
                System.out.println("Green Light");
                break;
            case 'O': case'o':      //or logic
                System.out.println("Orange Light");
                break;
            default:
                System.out.println("Invalid Light");
        }
    }
}
