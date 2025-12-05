class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int GCD = gcd(n,m);
        answer[0] = GCD;
        answer[1] = n*m/GCD;
        
        return answer;
    }
    
    public int gcd(int a, int b){
        int small = (a<b)?a:b;
        for(int i=small; i>0;i--){
            if(a%i==0 && b%i==0)
                return i;
        }
        return 1;
    }
    
}