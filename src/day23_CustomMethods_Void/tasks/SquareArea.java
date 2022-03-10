package day23_CustomMethods_Void.tasks;

public class SquareArea {

    public static void main(String[] args) {

        int edge=4;

        System.out.println(squareArea(edge));



    }

    public static int squareArea(int a){
        int result=a*a;
        return result;
    }

}
