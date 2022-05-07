package test;

public class qqq {
    static int a=50;

    public static void main(String[] args) {

        a=100;
        try {
            a=200;
        }catch (Exception e){
            a=300;
        }finally {
            a=400;
        }
        System.out.println(a);
    }
    static {
        a=500;
    }
}
