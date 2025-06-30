class Solution {
    public int[] solution(String s) {
        int count = 0;       
        int zeroCount = 0;   

        while (!s.equals("1")) {
            int beforeLength = s.length();
            s = s.replace("0", "");              
            int afterLength = s.length();
            zeroCount += (beforeLength - afterLength); // 제거된 0 개수 누적
            s = Integer.toString(afterLength, 2);
            count++;
        }

        return new int[]{count, zeroCount};
    }
}
