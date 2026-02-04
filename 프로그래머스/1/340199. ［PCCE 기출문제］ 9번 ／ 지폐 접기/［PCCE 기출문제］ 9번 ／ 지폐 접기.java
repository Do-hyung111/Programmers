class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int b_min = bill[1]<bill[0]?bill[1]:bill[0];
        int b_max = bill[1]<bill[0]?bill[0]:bill[1];
        int w_min = wallet[1]<wallet[0]?wallet[1]:wallet[0];
        int w_max = wallet[1]<wallet[0]?wallet[0]:wallet[1];
        
        while((b_min > w_min) || (b_max > w_max)){
            b_max/=2;
            answer++;
    
            if(b_min > b_max){
                int temp = b_max;
                b_max = b_min;
                b_min = temp;
            }
        }
        return answer;
    }
}