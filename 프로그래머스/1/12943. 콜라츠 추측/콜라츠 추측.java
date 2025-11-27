class Solution {
    public int solution(int num) {
        int cnt = 0;
        long temp = num;
        while(cnt < 500){
            if(temp==1)
                return cnt;
            
            temp = (temp%2==0) ? temp/2 : temp*3 + 1;
            cnt++;
        }
        
        return -1;
    }
}