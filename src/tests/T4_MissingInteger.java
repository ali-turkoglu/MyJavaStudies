package tests;

import java.util.HashSet;

public class T4_MissingInteger {

    public static void main(String[] args) {

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


        int[] A = {1, 3, 6, 4, 1, 2};

        System.out.println("solution(A) = " + solution(A));
    }

    public static int solution(int[] A) {

        HashSet<Integer> nums = new HashSet<>();
        for (int i = 1; i < A.length; i++) {
            nums.add(i);
            System.out.println(nums);
        }

        int result=1;

        for(int each :A) {
            nums.remove(each);
        }

        result=nums.iterator().next();
        return result;

    }
}