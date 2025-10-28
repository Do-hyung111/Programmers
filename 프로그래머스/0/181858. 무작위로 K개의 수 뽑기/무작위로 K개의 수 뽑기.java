import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] temp = Arrays.stream(arr).distinct().toArray();
        int[] answer = new int[k];
        for(int i=0; i<answer.length;i++){
            if(i>=temp.length)
                answer[i] = -1;
            else
                answer[i] = temp[i];
        }
    
        return answer;
    }
}