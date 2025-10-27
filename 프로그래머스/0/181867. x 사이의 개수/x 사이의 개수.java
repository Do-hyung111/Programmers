class Solution {
    public int[] solution(String myString) {
        String[] temp = myString.split("x");
        int Size = myString.charAt(myString.length()-1) != 'x' ? temp.length : temp.length+1;
        
        int[] answer = new int[Size];
        
        for(int i=0; i<temp.length;i++)
            answer[i] = temp[i].length();
        return answer;
    }
}