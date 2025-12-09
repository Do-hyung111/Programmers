class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        for(char c : s.toCharArray()){
            if(c==' '){
                idx = 0;
                answer.append(c);
            }
            else{
                if(idx%2==0)
                    answer.append(Character.toUpperCase(c));
                else
                    answer.append(Character.toLowerCase(c));
                idx++;
            }
        }
        return answer.toString();
    }
}