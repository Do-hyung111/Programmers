import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int max = 0;
        int min = 0;
        
        for(int i=0; i<lottos.length;i++){
            if(lottos[i] == 0){
                max++;
                continue;
            }
            for(int num : win_nums){
                if(num == lottos[i]){
                    min++;
                    break;
                }
            }
        }
        answer[0] = (max+min == 0)?6:7-(min+max);
        answer[1] = (min==0)?6:7-min;
        
        return answer;
    }
}