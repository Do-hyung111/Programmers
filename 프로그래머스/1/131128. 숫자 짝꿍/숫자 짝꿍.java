class Solution {
    public String solution(String X, String Y) {
        StringBuffer comp = new StringBuffer();
        int[] countX = count(X);
        int[] countY = count(Y);
        
        for(int i=0;i<countX.length;i++){      
            int size = (countX[i] < countY[i])?countX[i]:countY[i];
            for(int j=0; j<size;j++)
                comp.append(9-i);   
        }
        
        String answer = comp.toString();
        if(answer.equals(""))
            return "-1";
        else if(answer.matches("0+"))
            return "0";
        else
            return answer;
    }
    
    
    public int[] count(String S){
        char[] num = {'9','8','7','6','5','4','3','2','1','0'};
        
        int[] countS = new int[10];
        for(int i=0; i<10;i++){
            char check = num[i];
            long count = S.chars().filter(ch->ch==check).count();
            countS[i] = (int)count;
        }
        return countS;
    }
}