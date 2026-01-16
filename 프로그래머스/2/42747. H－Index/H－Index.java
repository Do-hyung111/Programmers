import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i=citations.length-1; 0<=i;i--){
            int h = citations[i];
            if(h<=answer)
                break;
            answer++;
        }
        
        return answer;
    }
}