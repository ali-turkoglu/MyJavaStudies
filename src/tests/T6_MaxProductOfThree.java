package tests;

import java.util.Arrays;

public class T6_MaxProductOfThree {

    public int solution(int[] A){

        int max1=0;
        int max1Index=0;
        int max2Index=0;
        int max3Index=0;
        int max2=0;
        int max3=0;

        for (int i=0;i<A.length;i++) {
            if (A[i] > max1) {
                max1 = A[i];
                max1Index = i;
            }
        }

        for (int i=0;i<A.length;i++) {
            if (A[i] > max2 && i!=max1Index) {
                max2 = A[i];
                max2Index = i;
            }
        }
        for (int i=0;i<A.length;i++) {
            if (A[i] > max3 && i!=max1Index && i!=max2Index) {
                max3 = A[i];
                max3Index = i;
            }
        }

        System.out.println( max1*max2*max3);
        return max1*max2*max3;
    }


    public static void main(String[] args) {
        T6_MaxProductOfThree maxProductOfThree=new T6_MaxProductOfThree();
        maxProductOfThree.solution(new int[]{4,5,1,0});
    }
}
