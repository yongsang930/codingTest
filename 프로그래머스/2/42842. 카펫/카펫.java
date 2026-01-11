class Solution {
    public int[] solution(int brown, int yellow) {
        int w = 0;
        int h = 0;
        int total = brown + yellow;
        
        for(int i = 3; i <= total/3; i++){
            if(total % i == 0){
                w = i > total / i ? i : total / i;
                h = i < total / i ? i : total / i;
                                
                if(yellow == ((w-2) * (h-2))){
                    return new int[]{w, h};
                }
            }
        }
        return new int[]{w, h};
    }
}