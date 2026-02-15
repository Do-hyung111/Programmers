import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int max = 0;
        
        Queue<int[]> q = new LinkedList<>();        

        for(int i=0; i<priorities.length;i++){
            q.offer(new int[]{priorities[i], i});
            
            if(max < priorities[i])
                max = priorities[i];
        }
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            if(cur[0] < max)
                q.offer(cur);
            else{
                answer++;
                if(cur[1] == location)
                    return answer;
            }    
            max = 0;
            for(int[] temp : q){
                max = Math.max(max,temp[0]);
            } 
            
        }
        
        
        return answer;
    }
}