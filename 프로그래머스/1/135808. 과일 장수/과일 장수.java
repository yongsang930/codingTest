import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        
        // 사과는 상태에 따라 1~K 점
        // K점이 최상품 1점이 최하품
        // 한상자에 M개씩 포장
        // 사과 한상자의 가격은 P * M
        // 사과는 상자단위로만 판매
        // 최대이익을 계산
        // 최저 사과점수 * 한 상자에 담긴 사과 개수 * 상자개수
                
        int answer = 0;
        
        Arrays.sort(score);
        
        for(int i = score.length-1; i >= 0; i-=m){            
            
            if(m > i+1) break;
            
            int min = score[i];
            
            for(int j = 0; j < m; j++){               
                if(min > score[i-j]){
                    min = score[i-j];
                }               
            }
            answer += min*m;
        }       
        return answer;
    }
}