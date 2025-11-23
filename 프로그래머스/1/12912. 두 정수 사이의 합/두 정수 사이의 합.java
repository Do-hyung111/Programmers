class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        int small = a;
        int big = b;
        
        if(a>b){
            small = b;
            big = a;
        }
        
        for(int i=small; i<=big;i++)
            sum += i;
        
        return sum;
    }
}