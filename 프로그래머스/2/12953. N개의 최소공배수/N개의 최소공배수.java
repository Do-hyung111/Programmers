class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        while(true){
            boolean TF = true;
            for(int i : arr){
                if(answer%i > 0){
                    TF = false;
                    break;
                }
            }
            if(TF)
                return answer;
            answer++;
        }
    }
}