class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        int[] temp;
        boolean same = false;
        
        while(same == false){
            temp = arr.clone();
            
            for(int i=0; i<arr.length; i++){
                if(arr[i] >= 50 && arr[i]%2 == 0)
                    arr[i] /= 2;
                else if(arr[i] < 50 && arr[i]%2 != 0)
                    arr[i] = arr[i]*2 + 1;
            }
            
            answer++;
            
            for(int i= 0; i<arr.length;i++){
                if(temp[i] == arr[i])
                    same = true;
                else{
                    same = false;
                    break;
                }
            }
        }
        return answer;
    }
}