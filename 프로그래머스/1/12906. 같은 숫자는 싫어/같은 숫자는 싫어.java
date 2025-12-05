import java.util.Vector;

public class Solution {
    public int[] solution(int []arr) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(arr[0]);
        for(int i=1; i<arr.length;i++){
            if(arr[i-1]!= arr[i])
                v.add(arr[i]);
        }
        
        int[] answer = new int[v.size()];
        for(int i=0; i<answer.length;i++)
            answer[i] = v.get(i);
        
        return answer;
    }
}