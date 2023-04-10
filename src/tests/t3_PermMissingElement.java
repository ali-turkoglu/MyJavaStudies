package tests;

import java.util.Arrays;

public class t3_PermMissingElement {

    public int solution(int[] A){

        Arrays.sort(A);
        int isMiss=1;
        for (int each : A) {
            if(each == isMiss){
                isMiss++;
                continue;
            }
        }

        System.out.println(isMiss);
        return isMiss;
    }


    public static void main(String[] args) {
        t3_PermMissingElement me=new t3_PermMissingElement();
        me.solution(new int[]{1,2,3,4,5,6,8});

    }
}
