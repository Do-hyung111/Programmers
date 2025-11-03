class Solution {
    public int solution(String num_str) {
        String[] str = num_str.split("");
        int answer = 0;
        for(String i: str)
            answer += Integer.parseInt(i);
        return answer;
    }
}