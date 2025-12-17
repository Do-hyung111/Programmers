class Solution {
    public int solution(int n) {
        int a = 0;
        int b = 1;
        
        for(int i=1; i<n;i++){
            int c = (a+b)%1234567;
            a = b;
            b = c;
        }
        
        return (n==0) ? 0 : b;
    }
}