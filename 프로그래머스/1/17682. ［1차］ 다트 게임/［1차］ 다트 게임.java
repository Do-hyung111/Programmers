class Solution {
    boolean star = false;
    public int solution(String dartResult) {
        int answer = 0;
        String[] sign = dartResult.split("[0-9]{1,2}");
        String[] num = dartResult.split("[SDT*#]{1,2}");
        int[] prior = new int[2];
        
        for(int i=0; i<num.length;i++){
            prior[0] = prior[1];
            prior[1] = Sqr(Integer.parseInt(num[i]), sign[i+1]);
            if(star){
                star = false;
                answer+=prior[0];
            }
            answer+=prior[1];
        }
        return answer;
    }
    
    public int Sqr(int Num, String Sign){
        char sign = Sign.charAt(0);
        int answer = 0;
        
        if(sign == 'S')
            answer += Num;
        else if(sign == 'D')
            answer += Num*Num;
        else if(sign == 'T')
            answer += Num*Num*Num;
        
        if(Sign.length() > 1){
            if(Sign.charAt(1)=='*'){
                star = true;
                return answer*2;
            }
            if(Sign.charAt(1)=='#')
                return answer*-1;
        }
        return answer;
    }
    
}