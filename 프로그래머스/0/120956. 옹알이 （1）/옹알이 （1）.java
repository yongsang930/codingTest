import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] strArr = {"aya", "ye", "woo", "ma"};
               
        for(String str : babbling){
            String temp = str;
            int cnt = 0;
            boolean[] tfArr = new boolean[strArr.length];
            
            while(cnt < strArr.length){
                if(tfArr[cnt] == true) {
                    cnt++;
                    continue;
                }
                                
                if(strArr[cnt].equals(temp)){
                    answer++;
                    break;
                } else if(temp.startsWith(strArr[cnt])){
                    temp = temp.substring(strArr[cnt].length());
                    tfArr[cnt] = true;
                    cnt = 0;
                    continue;
                } 
                cnt++;
            }
        }
        
        return answer;
    }
}