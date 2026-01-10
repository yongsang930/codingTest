class Solution {
    public int[] solution(String s) {       
        int zeroCount = 0;
        int count = 0;
        String str = "";
        
        
        while(!s.equals("1")){
            
            for(int i = 0; i < s.length(); i++){     
                if('0' == s.charAt(i)){
                    zeroCount++;
                }
            }
            
            str = s.replaceAll("0","");
            s = Integer.toBinaryString(str.length());
            count++;
        }
               
        
        return new int[]{count, zeroCount};
    }
}