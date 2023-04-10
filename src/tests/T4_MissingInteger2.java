package tests;

import java.util.Arrays;
import java.util.HashSet;

public class T4_MissingInteger2 {

    public static void main(String[] args) {

        int[] A = {1, 3, 6, 4, 1, 2};
        //int[] A = {-1, -3};

        System.out.println("solution(A) = " + solution(A));
    }

    public static int solution(int[] A) {

        Arrays.sort(A);

        int missingNumber=0;
        for (int i = 0; i < A.length; i++) {
            if (!(A[i]==A[i+1]||A[i]+1==A[i+1])){
                missingNumber=A[i]+1;
                break;
            }
        }
        for (int each:A){
            if(each<1){
                missingNumber=1;
            }
        }
        System.out.println(missingNumber);
        return missingNumber;
    }
}