import java.util.*;

class Solution {
    public String solution(int a, int b) {
        
        String[] arr = new String[]{"FRI","SAT", "SUN","MON","TUE","WED","THU"};
        int[] day = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
              
        int sum = 0;
        
        for(int i = 0; i < a-1; i++){
            sum += day[i];
        }
        
        sum += b-1;
        sum = sum % arr.length;
        
        return arr[sum];
    }
}