import java.util.ArrayList;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;        
        int[] burger = {1,2,3,1};
        ArrayList<Integer> ing = new ArrayList<>();
        
        for(int i:ingredient)
            ing.add(i);
        
        for(int i=0; i<=ing.size() - burger.length;i++){
            boolean comp = true;
            if(ing.get(i) == 1){
                for(int j=0;j<burger.length;j++){
                    if(ing.get(j+i) != burger[j]){
                        comp = false;
                        break;
                    }
                }
                if(comp){
                    ing.subList(i,i+burger.length).clear();
                    answer++;
                    i = Math.max(-1, i - 4);
                }
            }   
        }
        return answer;
    }
}