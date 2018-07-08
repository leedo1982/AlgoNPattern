package codility;

import java.util.Stack;

public class Brackets {
    public int solution(String S) {

        if (S.equals("")) {
            return 1;
        }

        Stack<Character> stack = new Stack();

        for (int i = 0; i < S.length(); i++) {
            if ('(' == S.charAt(i)) {
                stack.push('(');
            } else if ('[' == S.charAt(i)) {
                stack.push('[');
            } else if ('{' == S.charAt(i)) {
                stack.push('{');
            } else if (')' == S.charAt(i)) {
                if(stack.size() == 0 || !stack.pop().equals('(')){
                    return 0;
                }
            } else if (']' == S.charAt(i)) {
                if(stack.size() == 0 || !stack.pop().equals('[')){
                    return 0;
                }
            } else if ('}' == S.charAt(i)) {
                if(stack.size() == 0 || !stack.pop().equals('{')){
                    return 0;
                }
            }

        }
        return stack.size() == 0 ? 1 : 0;

    }
}
