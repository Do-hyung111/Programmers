class Solution {
    public int solution(int n) {
        int cnt = 0;
        int sum=0, temp = 0;
        for(int i=1; i<=n ;i++){
            sum=0;
            temp = i;
            while(sum < n)
                sum+=temp++;
            cnt += (sum==n) ? 1 : 0;
        }
        return cnt;
    }
}