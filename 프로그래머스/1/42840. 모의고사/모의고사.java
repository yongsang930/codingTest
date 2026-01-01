import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
      
        // 1, 2, 3, 4, 5
        // 2, 1, 2, 3, 2, 4, 2, 5
        // 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
        
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] count = new int[3];        
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == arr1[i%arr1.length]) count[0]++;
            if(answers[i] == arr2[i%arr2.length]) count[1]++;
            if(answers[i] == arr3[i%arr3.length]) count[2]++;
        }
              
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < count.length; i++){
            if(max == count[i]){
                list.add(i+1);
            }
        }
        
        int[] arr = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        
        Arrays.sort(arr);
        
        return arr;
    }
}