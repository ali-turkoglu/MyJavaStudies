package tests;

public class t3_TapeEqualibrium {

    public int solution(int[] A){

        int min=Integer.MAX_VALUE;
        int first=0;

        for (int i = 0; i < A.length; i++) {
            int differences=0;
            first+=A[i];
            int second=0;
            for (int j = i+1; j <A.length ; j++) {
                second+=A[j];
            }
            differences=Math.abs(first-second);

            if (min>differences){
                min=differences;
            }
        }

        System.out.println(min);
        return min;
    }

    public static void main(String[] args) {
        t3_TapeEqualibrium t3_tapeEqualibrium=new t3_TapeEqualibrium();
        t3_tapeEqualibrium.solution(new int[]{3,1,2,4,3});
    }
}
