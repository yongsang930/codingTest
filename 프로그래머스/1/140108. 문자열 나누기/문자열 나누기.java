class Solution {
    public int solution(String s) {
               
        // x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다
        // 처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리
        // 문자열들로 분해하고, 분해한 문자열의 개수
        
        char[] arr = s.toCharArray();
        char x = arr[0];
        int answer = 0;
        int count1 = 1;
        int count2 = 0;
        
        for(int i = 1; i < arr.length; i++){            
            if(x == arr[i]){
                count1++;
            } else {
                count2++;
            }
                        
            if(count1 == count2){
                answer++;
                count1 = 0;
                count2 = 0;
                
                if(i < arr.length - 1){
                    x = arr[i+1];
                }                 
            } 
        }
        
        if (count1 != 0 || count2 != 0) {
            answer++;
        }
        
        return answer;
    }
}