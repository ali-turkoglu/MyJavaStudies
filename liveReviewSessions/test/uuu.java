package test;

public class uuu {

    public static void main(String[] args) {

        int x= 7;
        if(available(x)) {                // Line 1
            System.out.println("Java SE");
        }else {
            System.out.println("Java EE");
        }

    }
    public static boolean available(int x) {
        return x > 1 ? true : false;
    }
}
