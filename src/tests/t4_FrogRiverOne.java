package tests;

import java.util.Arrays;

public class t4_FrogRiverOne {

    public int solution(int x, int[] A ){

        int time= -1;
        for (int i=0;i<A.length;i++){
            if(x==A[i]){
                time=i;
            }
        }

        System.out.println(time);

        return time;
    }

    public static void main(String[] args) {
        t4_FrogRiverOne frogRiverOne=new t4_FrogRiverOne();
        frogRiverOne.solution(5,new int[]{1,3,1,4,2,3,6,4});
        frogRiverOne.solution(1,new int[]{1});

    }
}
