package tests;

import day17_While_DoWhileLoop.WhileLoopIntro;

import java.util.Stack;

public class T7_StoneWall {

    public int solution(int[] H){

        int stoneBlock=0;
        Stack<Integer> stack=new Stack<>();

        for (int each:H){
            while(!stack.isEmpty()&&stack.peek()>each){
                stack.pop();
            }
            if (!stack.isEmpty()&& stack.peek()==each){

            }else {
                stack.push(each);
                stoneBlock++;
            }
        }

        return stoneBlock;
    }

    public static void main(String[] args) {
        T7_StoneWall stoneWall=new T7_StoneWall();
        System.out.println(stoneWall.solution(new int[]{8,8,5,7,9,8,7,4,8}));
    }
}
