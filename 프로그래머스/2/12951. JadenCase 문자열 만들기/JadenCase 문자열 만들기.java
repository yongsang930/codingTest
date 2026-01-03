import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();        
        boolean startTf = true;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
               sb.append(c);
               startTf = true;
               continue;
            }
            
            if(startTf){
               if('a' <= c && 'z' >= c){
                   sb.append((c + "").toUpperCase());                    
                } else if('A' <= c && 'Z' >= c){
                   sb.append((c + ""));                    
                } else {
                   sb.append((c + ""));                       
                }
                startTf = false;
                continue;
            } 
            
            if('A' <= c && 'Z' >= c){
                sb.append((c + "").toLowerCase());                    
            } else {
                sb.append((c + ""));                       
            }                   
        }
        
        return sb.toString();
    }
}