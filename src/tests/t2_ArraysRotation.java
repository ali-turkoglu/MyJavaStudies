package tests;

import java.util.Arrays;

public class t2_ArraysRotation {

    public int[] solution(int[] A,int K){

        for(int i=0;i<K;i++){
            int lastNumber=A[A.length-1];
            for (int j=A.length-2;j>=0;j--){
                A[j+1]=A[j];
            }
            A[0]=lastNumber;

        }
        return A;


    }

    public static void main(String[] args) {
        t2_ArraysRotation arr=new t2_ArraysRotation();
        System.out.println("arr.solution(new int[] = " + Arrays.toString(arr.solution(new int[]{1,2,3,4}, 4)));


    }
}
