package week14;

public class FinalKeyword {

    final int b;            // if variable is final, initializing is mandatory
    final static int c;

    public FinalKeyword(int b){
        this.b=b;
    }

    static{  // we can not initialize the static in constructor, but we can in static block
        c=5;
    }

    public static void main(String[] args) {

        // local variables
        final int a;
        a=100;

        System.out.println(a);
    }
}
