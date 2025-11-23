class Solution {
    public int[] solution(long n) {
        
        String temp = n + "";
        int[] answer = new int[temp.length()];
        
        for(int i=0; i<answer.length;i++){
            answer[i] = Integer.parseInt(temp.charAt(temp.length()-i-1)+"");
        }

        return answer;
    }
}