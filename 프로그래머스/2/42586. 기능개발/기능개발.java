import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        // 각 기능은 진도 100%일때 서비스
        // 앞에 있는 기능이 배포될때 뒤에 기능도 배포됨
        // 작업의 진도 배열 progresses
        // 각 작업의 개발속도 speeds
        // 각 배포마다 몇 개의 기능이 배포되는지 return
        
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++){
            queue.offer((int)Math.ceil((double)(100 - progresses[i]) / speeds[i]));
        }
        
        int temp = queue.poll();
        int count = 1;
        
        while(!queue.isEmpty()){
            int num = queue.peek();   
            
            // 현재 num과 뒤의 num을 비교하여 뒤의 num이 작거나 같으면 count++
            // 뒤의 num이 더 크면 count를 멈추로 list.add()
            
            if(temp >= num){
                count++;
                queue.remove();

                if(queue.isEmpty()){
                    list.add(count);    
                }
            } else {
                list.add(count);
                count = 0;
                temp = num;
            }
        }
        
        int[] arr = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }

        return arr;
    }
}