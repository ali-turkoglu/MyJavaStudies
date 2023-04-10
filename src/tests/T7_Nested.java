package tests;

import java.util.Stack;

public class T7_Nested {

    public int solution(String S) {
        Stack<Character> chStack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                chStack.push(S.charAt(i));
            } else if (S.charAt(i) == ')') {
                if (chStack.isEmpty() || chStack.peek() != '(') {
                    return 0;
                } else {
                    chStack.pop();
                }
            }
        }
        if (chStack.isEmpty()) {
            return 1;
        } else
            return 0;
    }

    public static void main(String[] args) {
        T7_Nested nested = new T7_Nested();
        System.out.println(nested.solution(new String("(()(())())")));
    }


}
