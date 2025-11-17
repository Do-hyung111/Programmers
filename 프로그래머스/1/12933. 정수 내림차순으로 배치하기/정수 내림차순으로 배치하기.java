import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String answer = "";
        
        String temp = n+"";
        char[] arr = new char[temp.length()];
        
        for(int i=0; i<temp.length();i++){
            arr[i] = temp.charAt(i);
        }
        Arrays.sort(arr);
        for(int i=1; i<=arr.length;i++){
            answer += arr[arr.length - i];
        }
            
        
        return Long.parseLong(answer);
    }
}