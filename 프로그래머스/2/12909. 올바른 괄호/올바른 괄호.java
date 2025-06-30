import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stk.push('(');
            } else {
                if (stk.isEmpty()) return false;
                stk.pop();
            }
        }

        return stk.isEmpty();
    }
}
