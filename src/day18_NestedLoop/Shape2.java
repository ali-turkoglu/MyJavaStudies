package day18_NestedLoop;

public class Shape2 {

    public static void main(String[] args) {

        char ch='*';
        String sh="";

            for (int j = 0; j < 10; j++) {
                System.out.println(sh);
                sh+=ch+" ";
            }

    }
}
/*Use a nested loop to print the following shape
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 * * * * * * * *
 * * * * * * * * *
 * * * * * * * * * *

 */