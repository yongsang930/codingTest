class Solution {
    public int solution(int n) {        
        return fib(n);
    }
    
    public int fib(int num){
        if(num == 0) return 0;
        if(num == 1 || num == 2) return 1;
        
        int result = 0;
        int a = 1, b = 1;
        
        for(int i = 3; i <= num; i++){
            result = (a + b) % 1234567;
            a = b;
            b = result;
        }
        
        return result;
    }
}