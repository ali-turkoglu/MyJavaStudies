package week07;

public class Task02 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {  // handles rows

            for (int j = 1; j <= i; j++) {   // handles columns

                // ternary operator

                // System.out.print(j%2==1? 1 : 0 ); // for odd columns print "1", for even columns "0"

                if(j%2==1){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }

            }
            System.out.println();

        }


       /* int rowCount = 6;// yanlış
        for(int row=1; row<=rowCount ; row++) {

            int value = row;
            for (int col = 1; col <= row; col++) {
                //System.out.print(value + " ");
                if(value%2==0) {
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }

                value += rowCount - col; // adding 4 for col=1, adding 3 col=2
            }
            System.out.println();

        }*/
    }
}
 /*
        	Write a Java program to print the following pattern
		1
		10
		101
		1010
		10101
		101010
		again we have 6 rows , 6 columns
		patern: for odd columns print "1", for even columns "0"
         */

