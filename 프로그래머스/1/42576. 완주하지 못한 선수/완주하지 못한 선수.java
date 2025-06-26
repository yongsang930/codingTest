import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        // 참여한 선수 [] participant
        // 완주한 선수 [] completion
        // 완주하지 못한 선수를 return
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String player : participant){
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        for(String player : completion){
            map.put(player, map.get(player) - 1);
        }
        
        for(Map.Entry<String, Integer> temp : map.entrySet()){
            if(temp.getValue() == 1) return temp.getKey();
        }
         
        return "";
    }
}