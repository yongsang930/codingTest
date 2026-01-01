import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
                
        Stack<Integer> sck = new Stack<Integer>();
        
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                sck.push(arr[i]);
            } else {
                if(sck.peek() != arr[i]){
                    sck.push(arr[i]);
                }
            } 
        }
        
        int[] answer = new int[sck.size()];
        
        for(int i = answer.length - 1; i >= 0 ; i--){
            answer[i] = sck.pop();
        }
      
        return answer;
    }
}