class Solution {
    public String solution(int a, int b) {
        int sum = 0;
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i=0; i<a-1;i++)
            sum+=days[i];
        
        
        return week[(sum+b-1)%7];
    }
}