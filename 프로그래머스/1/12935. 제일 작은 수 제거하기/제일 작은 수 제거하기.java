class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        
        if(arr.length == 1)
            return answer;
        
        int min = arr[0];
        for(int i=1; i<arr.length;i++){
            if(min > arr[i])
                min = arr[i];
        }
        
        answer = new int[arr.length - 1];
        int cnt = 0;
        
        for(int i=0; i<arr.length;i++){
            if(min == arr[i])
                continue;
            else
                answer[cnt++] = arr[i];
        }
        return answer;
    }
}