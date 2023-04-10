package tests;

import java.util.ArrayList;
import java.util.List;

public class t2_OddOccurrenceInArray {

    public int solution(int[] A) {

        List<Integer> aList=new ArrayList<>();


        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            if(aList.contains(a)){
                aList.remove((Integer.valueOf(a)));
            }else {
                aList.add(a);
            }
        }
        System.out.println(aList.iterator().next());
        return aList.iterator().next();
    }


    public static void main(String[] args) {

        t2_OddOccurrenceInArray odd = new t2_OddOccurrenceInArray();
        odd.solution(new int[]{9, 3, 9, 3, 9, 7, 9});


    }

}
