import java.util.Vector;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        Vector<Integer> v = new Vector<Integer>();
        for(int i=0; i<arr.length;i++){
            if(arr[i]%divisor == 0)
                v.add(arr[i]);
        }
        
        Collections.sort(v);
        
        if(v.isEmpty()){
            v.add(-1);
        }
        
        int[] answer = new int[v.size()];
        for(int i=0; i<v.size();i++){
            answer[i] = v.get(i);
        }
        
        
        return answer;
    }
}