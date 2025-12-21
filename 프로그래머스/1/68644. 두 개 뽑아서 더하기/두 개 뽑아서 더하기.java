import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(!arr.contains(numbers[i]+numbers[j]))
                    arr.add(numbers[i]+numbers[j]);
            }
        }
        
        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size();i++)
            answer[i] = arr.get(i);
        Arrays.sort(answer);       
        return answer;
    }
}