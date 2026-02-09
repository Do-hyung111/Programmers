class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            answer+=sosu(i);
        }
        return answer;
    }
    
    public int sosu(int n){
        if(n<2) return 0;
    
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return 0;
        }
        return 1;
    }
    
}