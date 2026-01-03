import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();        
        char[] charArray = s.toCharArray();       
        boolean startTf = true;
        
        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] == ' '){
               sb.append(" ");
               startTf = true;
               continue;
            }
            
            if(startTf){
               if('a' <= charArray[i] || 'z' >= charArray[i]){
                    sb.append((charArray[i] + "").toUpperCase());                    
                } 
                startTf = false;
                continue;
            } 
            sb.append((charArray[i] + "").toLowerCase());                       
        }

        
        return sb.toString();
    }
}