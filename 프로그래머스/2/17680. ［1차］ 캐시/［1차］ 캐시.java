import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        Queue q = new LinkedList();
        
        for(int i=0; i<cities.length;i++){
            String s = cities[i].toUpperCase();
            if(q.contains(s)){
                answer++;
                q.remove(s);
                q.add(s);
            }
            else{
                answer+=5;
                q.add(s);
            }           
            if(q.size() > cacheSize){
                q.poll();
            }
        }
        
        return answer;
    }
}