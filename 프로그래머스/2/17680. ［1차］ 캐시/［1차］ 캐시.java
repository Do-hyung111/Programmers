import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize==0)
            return cities.length*5;
        
        int answer = 0;
        Queue<String> q = new LinkedList<>();
        
        for(int i=0; i<cities.length;i++){
            String s = cities[i].toUpperCase();
            if(q.contains(s)){
                answer++;
                q.remove(s);
            }
            else
                answer+=5;
            
            q.add(s);
            if(q.size() > cacheSize){
                q.poll();
            }
        }
        
        return answer;
    }
}