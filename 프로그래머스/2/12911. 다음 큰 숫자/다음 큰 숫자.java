class Solution {
    public int solution(int n) {
        int answer = n;
        int temp = Integer.bitCount(n);
        while(Integer.bitCount(++answer) != temp){}
        return answer;
    }
}