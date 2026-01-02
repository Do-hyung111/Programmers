import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        int prior = 0;
        int sum = 0;
        ArrayList<Integer> sums = new ArrayList<>();
        
        Arrays.sort(tangerine);
        for(int i = 0;i<tangerine.length;i++){
            if((prior != tangerine[i] && i!=0)){
                sums.add(sum);
                sum = 0;
            }
            sum++;
            prior = tangerine[i];
        }
        sums.add(sum);
        
        sum = 0;
        Collections.sort(sums, Collections.reverseOrder());
        for(int i : sums){
            sum += i;
            answer++;
            if(sum>=k)
                break;
        }
        
        return answer;
    }
}