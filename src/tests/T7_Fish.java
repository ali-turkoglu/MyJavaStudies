package tests;

import java.util.Stack;

public class T7_Fish {

    public int solution(int[] A,int[] B){

        int livingFish=0;
        Stack<Integer> stack=new Stack<>();

        for (int i = 0; i < A.length; i++) {
            if (B[i]==1){
                stack.push(A[i]);
            }else{
                while (!(stack.isEmpty()) && A[i]>stack.peek()){
                    stack.pop();
                }
                if (stack.isEmpty()){
                    livingFish++;
                }
            }
        }

        return stack.size()+livingFish;

    }

    public static void main(String[] args) {
        T7_Fish fish=new T7_Fish();
        System.out.println(fish.solution(new int[]{4,3,2,1,5},new int[] {0,1,0,0,0}));

    }
}
