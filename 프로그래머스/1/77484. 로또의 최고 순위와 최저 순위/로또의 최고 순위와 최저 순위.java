import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        // 알수없는 번호 0
        // 로또번호 6개
        // 순서와 상관없이 번호만 일치하면 맞힌걸로 인정
        
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[2];
        int max = 0;
        int count = 0;
        
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] != 0){
                list.add(lottos[i]);    
            }
        }
        
        for(int i = 0; i < win_nums.length; i++){
            for(int j = 0; j < list.size(); j++){
                if(win_nums[i] == list.get(j)){
                    count++;
                    list.remove(j);
                    break;
                }
            }
            
            if(lottos[i] == 0) {
                max++;
            }
        }
        
        int[] intArr = new int[]{6, 6, 5, 4, 3, 2, 1};
                       
        answer[0] = intArr[count + max];
        answer[1] = intArr[count];
        
        return answer;
    }
}