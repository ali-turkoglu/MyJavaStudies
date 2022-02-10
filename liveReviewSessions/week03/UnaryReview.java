package week03;

public class UnaryReview {
    public static void main(String[] args) {

        int a = 20;


        System.out.println("a++ = " + a++); //20
        System.out.println("a   = " + a);     //21

        int b= 20;
        System.out.println("++b = " + ++b); //21

        int c = 20;
        System.out.println("++c = " + 1);   //22

        boolean  isMarried = true;
        System.out.println("isMarried = " + !isMarried);    // false

        int x = 12;

        if (++x>12){  //pre increment operator
            System.out.println("x in the if Statement part = " + x);//13
        }else{
            System.out.println("x value in the Else Statement part = " + x);
        }

        int y = 12;

        if (y++>12){  // post increment operator
            System.out.println("y in the if Statement part = " + y);
        }else{
            System.out.println("y value in the Else Statement part = " + y);//13
        }
    }
}
