package tests;

import java.sql.Array;
import java.util.Arrays;

public class T4_MaxCounters {

    public int[] solution(int N, int[] A) {

        int[] newArr = new int[N];
        System.out.println(Arrays.toString(newArr));

        for (int i = 0; i < A.length; i++) {
            if (A[i] > N) {
                int max = 0;
                for (int z = 0; z < newArr.length; z++) {
                    if (max < newArr[z]) {
                        max = newArr[z];
                    }
                }
                System.out.println("max" + max);
                for (int j = 0; j < newArr.length; j++) {
                    newArr[j] = max;
                }
            }
            if (A[i] <= N) {
                newArr[A[i] - 1]++;
            }
        }
        return newArr;
    }


    public static void main(String[] args) {
        T4_MaxCounters maxCounters = new T4_MaxCounters();
        maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
    }
}
