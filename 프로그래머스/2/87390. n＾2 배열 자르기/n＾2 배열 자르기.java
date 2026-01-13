import java.util.Arrays;

class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int)(right - left +1);
        int[] answer = new int[size];
        
        int idx = 0;
        for(long i=left;i<=right;i++){
            int row = (int)(i/n)+1;
            int col = (int)(i%n)+1;
            int num = Math.max(row, col);
            answer[idx++] = num;
        }
        
        return answer;
        
    }
}