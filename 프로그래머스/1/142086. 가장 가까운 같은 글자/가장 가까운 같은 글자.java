class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] temp = s.toCharArray();
        
        for(int i=0; i<temp.length;i++){
            answer[i] = -1;
            for(int j=i-1;0<=j;j--){
                if(temp[j] == temp[i]){
                    answer[i]=i-j;
                    System.out.println(j);
                    break;
                }
            }
        }
        
        return answer;
    }
}