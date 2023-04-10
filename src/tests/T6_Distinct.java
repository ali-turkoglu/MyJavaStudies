package tests;

import java.util.HashSet;

public class T6_Distinct {

    public int solution(int[] A){

        HashSet hlist=new HashSet();
        for (int each:A){
            hlist.add(each);
        }
        int length=hlist.size();
        System.out.println(length);
        return length;
    }

    public static void main(String[] args) {
        T6_Distinct distinct=new T6_Distinct();
        distinct.solution(new int[]{2,1,1,2,3,1});
    }
}
