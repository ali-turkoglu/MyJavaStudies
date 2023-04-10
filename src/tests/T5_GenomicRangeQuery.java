package tests;

import java.util.Arrays;

public class T5_GenomicRangeQuery {


    public int[] solution(String S,int[] P,int[] Q){

        int[] result=new int[P.length];

        char[] ch=S.toCharArray();
        int[] arr=new int[ch.length];
        for (int i=0;i<ch.length;i++){
            switch (ch[i]){
                case 'A':
                    arr[i]=1;
                    break;
                case 'C':
                    arr[i]=2;
                    break;
                case 'G':
                    arr[i]=3;
                    break;
                case 'T':
                    arr[i]=4;
                    break;
            }
        }

        for (int i = 0; i < P.length; i++) {
            int minimalImpact=Integer.MAX_VALUE;
            for (int j = P[i]; j <=Q[i]; j++) {
                if(minimalImpact>arr[j]){
                    minimalImpact=arr[j];
                }
            }
            result[i]=minimalImpact;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
        return result;

    }


    public static void main(String[] args) {
        T5_GenomicRangeQuery genomicRangeQuery=new T5_GenomicRangeQuery();
        genomicRangeQuery.solution("CAGCCTA",new int[]{2,5,0},new int[]{4,5,6});

    }
}
