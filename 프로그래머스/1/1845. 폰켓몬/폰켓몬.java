import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        //  총 N 마리의 폰켓몬 중에서 N/2마리
        // 폰켓몬은 종류에 따라 번호를 붙여 구분
        // 최대한 많은 종류의 포켓몬을 포함한 N/2마리
        // N마리 포켓몬의 종류번호가 담
                
        Set set = new HashSet();
        
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }       
        
        return Math.min(set.size(), nums.length / 2);
    }
}