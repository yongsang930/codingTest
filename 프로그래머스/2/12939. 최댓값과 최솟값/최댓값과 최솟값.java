class Solution {
    public String solution(String s) {

        String[] str = s.split(" ");

        int max = Integer.MIN_VALUE;  // 최솟값으로 초기화
        int min = Integer.MAX_VALUE;  // 최댓값으로 초기화

        for(int i = 0; i < str.length; i++){
            int num = Integer.parseInt(str[i]);

            if(max < num){
                max = num;
            }

            if(min > num){
                min = num;
            }
        }

        return min + " " + max;
    }
}
