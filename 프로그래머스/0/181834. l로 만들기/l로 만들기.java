class Solution {
    public String solution(String myString) {
        String answer = myString;
        
        for(int i=0; i<answer.length();i++){
            if(answer.charAt(i) < 'l'){
                answer = answer.replace(""+answer.charAt(i), "l");
            }
        } 
        return answer;
    }
}