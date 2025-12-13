class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i=0;i<number.length ;i++){
            for(int j=i; j<number.length; j++){
                if(i==j)
                    continue;
                for(int k=j;k<number.length;k++){
                    if(k==i || k==j)
                        continue;
                    answer += (number[i]+number[j]+number[k] == 0)?1:0;
                }
            }    
        }
        
        return answer;
    }
}