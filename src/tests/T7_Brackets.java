package tests;

import java.util.Stack;

public class T7_Brackets {

    public int solution(String S){

        Stack<Character> chStack=new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i)=='('||S.charAt(i)=='{'||S.charAt(i)=='['){
                chStack.push(S.charAt(i));
            }else if (S.charAt(i)==')'){
                if(chStack.isEmpty()||chStack.peek()!='('){
                    return 0;
                }else{
                    chStack.pop();
                }
            }else if (S.charAt(i)=='}'){
                if(chStack.isEmpty()||chStack.peek()!='{'){
                    return 0;
                }else{
                    chStack.pop();
                }
            }else if (S.charAt(i)==']'){
                if(chStack.isEmpty()||chStack.peek()!='['){
                    return 0;
                }else{
                    chStack.pop();
                }
            }
        }
        if (chStack.isEmpty()){
            return 1;
        }else
            return 0;
    }

    public static void main(String[] args) {
        T7_Brackets brackets=new T7_Brackets();
        System.out.println(brackets.solution(new String("({[]})")));
    }
}
