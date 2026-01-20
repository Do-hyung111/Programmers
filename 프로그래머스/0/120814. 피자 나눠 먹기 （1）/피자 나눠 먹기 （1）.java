class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n>7*answer)
            answer++;
        
        return answer;
    }
}