import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        int[] answer = new int[numlist.length];
        int idx = 0;
        
        Arrays.sort(numlist);
        
        Map<Integer, Integer> map = new HashMap();
        
        for(int i = 0; i < numlist.length; i++){
            map.put(numlist[i], Math.abs(n-numlist[i]));
        }
        
        List<Map.Entry<Integer,Integer>> eList = new LinkedList<>(map.entrySet());       
        eList.sort(Map.Entry.<Integer, Integer>comparingByKey().reversed());                
        eList.sort(Map.Entry.comparingByValue());

        for(Map.Entry<Integer, Integer> entry : eList){
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
            answer[idx++] = entry.getKey();
        }
        
        return answer;
    }
}