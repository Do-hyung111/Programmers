import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int people = 2;
        int cycle = 1;
        boolean NoBody = true;
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(words[0]);

        for(int i=1; i<words.length;i++){
            char prior = words[i-1].charAt(words[i-1].length()-1);
            char now = words[i].charAt(0);
            
            if(arr.contains(words[i])){
                NoBody = false;
                break;
            }
            arr.add(words[i]);
            if(prior != now){
                NoBody = false;
                break;
            }
            
            if(people == n){
                people = 0;
                cycle++;
            }
            people++;
        }
        
        if(NoBody){
            answer[0] = 0;
            answer[1] = 0;
        }
        else{
            answer[0] = people;
            answer[1] = cycle;
        }
        
        return answer;
    }
}