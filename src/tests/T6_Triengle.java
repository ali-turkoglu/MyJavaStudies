package tests;

import java.util.Arrays;

public class T6_Triengle {

    public int solution(int[] A){

        Arrays.sort(A);
        for (int i=0; i<A.length-2;i++){
            if(A[i]+A[i+1]>A[i+2]){
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        T6_Triengle triengle=new T6_Triengle();
        System.out.println(triengle.solution(new int[]{10,2,5,1,8,20}));
    }
}
