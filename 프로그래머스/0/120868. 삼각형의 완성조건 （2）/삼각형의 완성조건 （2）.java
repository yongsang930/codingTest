class Solution {
    public int solution(int[] sides) {

        int count = 0;
                       
        int num1 = sides[0] + sides[1]; // 나머지 한변이 긴 경우
        int num2 = sides[0] >= sides[1] ? sides[0] : sides[1]; // 둘 중 긴 것
        int num3 = sides[0] <= sides[1] ? sides[0] : sides[1]; // 둘 중 작은 것
        
        for(int i = num1-1; i > num2; i--){
            count++;
        }
        
        
        for(int i = 1; i <= num2; i++){
            if((i + num3) > num2) {
                count++;
            }
        }
        
        return count;
    }
}