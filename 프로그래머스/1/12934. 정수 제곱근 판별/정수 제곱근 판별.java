class Solution {
    public long solution(long n) {
        long sqrt = (long)Math.sqrt(n);
        
        if (sqrt * sqrt == n){
            long next = sqrt + 1;
            return next * next;
        } 
        else {
            return -1;
        }
    }
}
