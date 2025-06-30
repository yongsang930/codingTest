import java.util.*;
import java.math.*;

class Solution {
    public int solution(int n) {
        return nextSameOneCount(n);
    }
    
    public int nextSameOneCount(int num){
        int cnt = countNumOne(num);
                
        while(true){
            num++;
            int tempNum = countNumOne(num);
            if(cnt == tempNum) return num;
        }
    }
    
    public int countNumOne(int num){
        return Integer.bitCount(num);
    }
}