import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
            
        for(int i = 0; i < targets.length; i++){
            String str = targets[i];
            
            for(int j = 0; j < str.length(); j++){
                String alpabet = String.valueOf(str.charAt(j));
                int min = 101;
                
                for(String temp : keymap){
                    if(temp.contains(alpabet)){
                        int idx = temp.indexOf(alpabet) + 1;
                        min = idx < min ? idx : min;
                       //System.out.println(temp + " " + alpabet + " " + min);
                    } 
                }
                if(min == 101) {
                    answer[i] = -1; 
                    break;
                } else {
                    answer[i] += min;
                }
            }
        }    
                
        return answer;
    }
}