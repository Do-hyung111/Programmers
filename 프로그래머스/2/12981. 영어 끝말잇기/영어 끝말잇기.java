import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(words[0]);

        for(int i=1; i<words.length;i++){
            char prior = words[i-1].charAt(words[i-1].length()-1);
            char now = words[i].charAt(0);
            
            if(arr.contains(words[i])||prior!=now){
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;
            }
            arr.add(words[i]);
        }
        
        return answer;
    }
}