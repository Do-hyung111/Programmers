class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder left = new StringBuilder();
        
        for(int i=1; i<food.length;i++){
            for(int j=0; j<food[i]/2;j++)
                left.append(i);
        }
        answer.append(left);
        answer.append(0);
        answer.append(left.reverse());
        
        return answer.toString();
    }
}