package day17_While_DoWhileLoop;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i ='a' ; i <='z' ; i++) {

           if (i=='c'){
               continue; // c is skipped, ====> a b d e f ........
           }
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("____________________________________________________");

        for (int i = 1; i <=10 ; i++) {

            if (i%2==0){
                continue; //skip
            }
            System.out.print(i+" ");    // 1 3 5 7 9
        }

        System.out.println();
        for (int j = 1; j <=10 ; j++) {

            if (j%2==1){
                continue;   // skip
            }
            System.out.print(j+" ");        // 2 4 6 8 10
        }

        System.out.println();
        System.out.println("_________________________________________________");





    }
}
