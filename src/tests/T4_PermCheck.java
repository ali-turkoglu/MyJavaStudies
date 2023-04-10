package tests;

import java.util.Arrays;

public class T4_PermCheck {
    public int solution(int[] A) {

        Arrays.sort(A);
        int isPermutation = 1;
        for (int i = 0,j=1; i < A.length-1; i++,j++) {
            if (!(A[i]+1 == A[j])) {
                isPermutation = 0;
                break;
            }
        }

        System.out.println(isPermutation);
        return isPermutation;
    }


    public static void main(String[] args) {
        T4_PermCheck permCheck = new T4_PermCheck();
        permCheck.solution(new int[]{3,2,0,4});


    }
}
