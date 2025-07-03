import java.util.Stack;

class Solution {
    public int solution(String s) {
               
        Stack<Character> stk = new Stack<Character>();
        
        for(char alphabet : s.toCharArray()){
           
            if(stk.isEmpty()) {
                stk.add(alphabet);
                continue;
            } else {
                if(stk.peek() == alphabet){
                    stk.pop();
                    continue;
                }
                stk.add(alphabet);
            }
        }

        return stk.isEmpty() ? 1 : 0;
    }
}
