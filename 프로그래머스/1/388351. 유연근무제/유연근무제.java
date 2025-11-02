class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        boolean chk = true;
        int day = startday;
        int time = 0;
        
        for(int i=0; i<schedules.length;i++){
            chk = true;
            day = startday;
            
            time = schedules[i]+10;
            if(time%100 >= 60)
                time = time + 100 - 60;
            
            for(int j=0; j<7;j++){
                if(day%7 == 6|| day%7 == 0){
                    day++;
                    continue;
                }
                if(time < timelogs[i][j]){
                    chk = false;
                    break;
                }
                day++;
            }
            if(chk)
                answer++;
        }
        return answer;
    }
}