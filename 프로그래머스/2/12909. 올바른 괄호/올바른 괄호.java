import java.util.*;

class Solution {
    boolean solution(String s) {
//         boolean answer = true;

//         int chk = 0;
        
//         for(int i = 0; i < s.length(); i++){
//             if( '(' == s.charAt(i)) {
//                 chk++;
//             } else {
//                 chk--;
//             }
//             if(chk < 0) return false;
          
//         }
        
        Stack<Character> stk = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++){
            if( '(' == s.charAt(i)){
                stk.push(s.charAt(i));
            } else {
                if(!stk.isEmpty()){
                    stk.pop();
                } else {
                    return false;
                }
            }
        }

        return stk.isEmpty();
    }
}