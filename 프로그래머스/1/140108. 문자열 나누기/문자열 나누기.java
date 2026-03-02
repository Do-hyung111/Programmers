class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] word = s.toCharArray();
        char x = word[0];
        int x_num = 0, rest_num = 0;
        for(int i=0; i<word.length;i++){
            if(x_num == rest_num){
                answer++;
                x = word[i];
                x_num=0;
                rest_num=0;
            }
            if(x == word[i])
                x_num++;
            else
                rest_num++;
        }
        
        return answer;
    }
}