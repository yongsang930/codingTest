class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ", -1); // 공백 유지용 옵션 -1
        
        for(int i = 0; i < arr.length; i++){               
            if (!arr[i].isEmpty() && Character.isLetter(arr[i].charAt(0))) {
                arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
            }else{
                arr[i] = arr[i].toLowerCase();    
            }
            
            if(arr.length -1 == i) answer += arr[i];   
            else  answer += arr[i] + " ";  
        }        
        return answer;
    }
}