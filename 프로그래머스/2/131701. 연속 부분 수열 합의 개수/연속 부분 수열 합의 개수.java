import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        
        for(int i=1; i<=elements.length;i++){
            for(int j=0; j<elements.length;j++){
                int temp = 0;
                int cnt = 0;
                int index = j;
                while(cnt < i){
                    temp += elements[index++];
                    if(index>=elements.length)
                        index = 0;
                    cnt++;
                }
                set.add(temp);
            }
        }
        
        return set.size();
    }
}