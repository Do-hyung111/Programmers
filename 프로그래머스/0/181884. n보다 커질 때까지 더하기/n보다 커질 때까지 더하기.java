class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int idx = 0;
        
        while(answer <= n){
            System.out.println(answer + "," +numbers[idx]);
            answer += numbers[idx++];
        }
        return answer;
    }
}