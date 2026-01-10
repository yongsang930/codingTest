class Solution {
    public int solution(int n) {
        int count1 = 0;
        int count2 = 0;
        String str = Integer.toBinaryString(n);
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1') count1++;
        }    
                    
        while(count1 != count2){
            
            count2 = 0;
            
            n++;
            
            str = Integer.toBinaryString(n);
                
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '1') count2++;
            } 
            
            if(count1 == count2) return n;            
        }
 
        return n;
    }
}