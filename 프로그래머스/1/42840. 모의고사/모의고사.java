import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        // 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5     
        // 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5
        // 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
        
        int[] A = new int[]{1, 2, 3, 4, 5};
        int[] B = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] C = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] count = new int[3];
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == A[i%A.length]) count[0]++;
            if(answers[i] == B[i%B.length]) count[1]++;
            if(answers[i] == C[i%C.length]) count[2]++;
        }
        
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        List<Integer> list = new ArrayList();
        
        for(int i = 0; i < count.length; i++){
            if(max == count[i]){
                list.add(i+1);
            }
        }
        
        int[] intArr = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            intArr[i] = list.get(i);
        }  
        
        Arrays.sort(intArr);
        
        return intArr;
    }
}