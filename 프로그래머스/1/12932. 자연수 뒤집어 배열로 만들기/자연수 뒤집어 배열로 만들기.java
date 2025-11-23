class Solution {
    public long[] solution(long n) {
        
        String size = n + "";
        long[] answer = new long[size.length()];
        int count = 0;
        
        while(count < size.length()){
            answer[count] = n%10;
            n = n/10;
            count++;
        }

        return answer;
    }
}