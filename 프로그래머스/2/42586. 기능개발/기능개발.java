import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<progresses.length;i++){
            int temp = progresses[i];
            int cnt = 0;
            int num = 1;
            while(temp < 100){
                temp += speeds[i];
                cnt++;
            }
            int idx = i+1;
            for(int j=i+1;j<progresses.length;j++){
                if(progresses[j]+(speeds[j]*cnt) < 100)
                    break;
                num++;
                i++;
            }

            arr.add(num++);
        }
        
        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size();i++)
            answer[i] = arr.get(i);
        
        return answer;
    }
}