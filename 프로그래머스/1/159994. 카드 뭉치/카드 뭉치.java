class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cd1 = 0;
        int cd2 = 0;
        
        for(int i=0;i<goal.length;i++){
            if(cd1 < cards1.length&&cards1[cd1].equals(goal[i]))
                cd1++;
            else if(cd2 < cards2.length&&cards2[cd2].equals(goal[i]))
                cd2++;
            else{
                answer = "No";
                break;
            }
        }
        
        
        
        return answer;
    }
}