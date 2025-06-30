import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        // 모든 지수르 K 이상
        // 모든 음식이 K 이상 될때까지 섞음
        // 섞어야 하는 최소 횟수를 return
        // 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1
        // newValue = a + (b * 2)
        
        int count = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int num : scoville){
            pq.add(num);
        }
                
        while (pq.size() >= 2 && pq.peek() < K) {
            int first = pq.poll();
            int second = pq.poll();
            int newScoville = first + (second * 2);
            pq.offer(newScoville);
            count++;
        }

        if (pq.isEmpty() || pq.peek() < K) return -1;
        return count;

    }
}