import java.util.Arrays;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        for(int i=0; i<section.length; i++){
            int num = section[i] + m - 1;
            
            for(int j=i+1;j<section.length;j++){
                if(section[j]<=num)
                    i++;
            }
            answer++;
        }
        
        
        
        return answer;
    }
}