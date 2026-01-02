class Solution {
    public int solution(int n) {
        int before = 0;
        int after = 1;

        int sum = 0;
        
        for(int i = 2; i <= n; i++){
            
            sum = (before + after) % 1234567;
            before = after;
            after = sum;
            
        }
        
        return sum ;
    }
   
}