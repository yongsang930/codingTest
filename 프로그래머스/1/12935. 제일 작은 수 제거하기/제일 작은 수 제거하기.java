import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(arr.length == 1){
            return new int[]{-1};
        }
        
        int min = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            min = arr[i] < min ? arr[i] : min;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != min) list.add(arr[i]);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}