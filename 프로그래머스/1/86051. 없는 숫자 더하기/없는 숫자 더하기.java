import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i=0; i<=9; i++){
            boolean contain = false;
            for(int j=0; j<numbers.length;j++){
                if(numbers[j] == i)
                    contain = true;
            }
            answer += (contain) ? 0 : i;
        }
        
        return answer;
    }
}