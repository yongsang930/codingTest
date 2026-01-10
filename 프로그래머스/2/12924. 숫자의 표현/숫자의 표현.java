class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        for(int i = 1; i <= n; i++){
            if(i == n) {
                count++;    
                break;
            }
            answer += i;
            
            for(int j = i+1; j <= n; j++){
                answer+=j;

                if(answer == n){
                    count++;    
                } else if(answer > n){
                    break;
                }
            }
            answer = 0;
        }
        
        return count;
    }
}