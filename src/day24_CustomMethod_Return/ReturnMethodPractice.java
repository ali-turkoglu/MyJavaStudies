package day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        //find the max number between 100&200
        int maxNumber=max(100,200);
        System.out.println("maxNumber = " + maxNumber);


        //multiply the max number by 2
        int multiplication=maxNumber*2;
        System.out.println("multiplication = " + multiplication);

    }


    public static int max(int a,int b){

        int result=(a>b)?a:b;

        return result;

    }





}
