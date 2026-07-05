class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        int[] score = new int[4];
        String word = "RTCFJMAN";
        
        for(int i=0; i<survey.length;i++){
            if(survey[i].charAt(0) == word.charAt(0))
                score[0] -= choices[i]-4;
            else if(survey[i].charAt(0) == word.charAt(1))
                score[0] += choices[i]-4;
            
            else if(survey[i].charAt(0) == word.charAt(2))
                score[1] -= choices[i]-4;
            else if(survey[i].charAt(0) == word.charAt(3))
                score[1] += choices[i]-4;
            
            else if(survey[i].charAt(0) == word.charAt(4))
                score[2] -= choices[i]-4;
            else if(survey[i].charAt(0) == word.charAt(5))
                score[2] += choices[i]-4;
            
            else if(survey[i].charAt(0) == word.charAt(6))
                score[3] -= choices[i]-4;
            else if(survey[i].charAt(0) == word.charAt(7))
                score[3] += choices[i]-4;
            
            else
                System.out.println("error");
        }
        
        for(int i =0; i<score.length;i++){
            if(score[i] >= 0)
                answer.append(word.charAt(i*2));
            else
                answer.append(word.charAt(i*2+1));
        }
        
        return answer.toString();
    }
}