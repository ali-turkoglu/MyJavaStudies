package tests;

public class T5_MinAvgTwoSlice {

    public int solution(int[] A){

        int indexof2=-1;
        int minof2=Integer.MAX_VALUE;
        for (int i = 0; i < A.length-1; i++) {

            if(A[i]+A[i+1]/2<minof2){
                minof2=A[i]+A[i+1]/2;
                indexof2=i;
            }
            if(i<A.length-2) {
                if (A[i] + A[i + 1] + A[i + 2] / 3 < minof2) {
                    minof2 = A[i] + A[i + 1] + A[i + 2] / 3;
                    indexof2 = i;
                }
            }
        }
        System.out.println(indexof2);

        return indexof2;
    }


    public static void main(String[] args) {
        T5_MinAvgTwoSlice minAvgTwoSlice=new T5_MinAvgTwoSlice();
        minAvgTwoSlice.solution(new int[]{10,11,-20,5} );
    }
}
