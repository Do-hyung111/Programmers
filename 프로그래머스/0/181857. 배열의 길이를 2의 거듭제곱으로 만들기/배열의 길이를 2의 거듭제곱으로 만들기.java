import java.util.Vector;

class Solution {
    public int[] solution(int[] arr) {
        Vector<Integer> temp = new Vector<Integer>();
        
        for(int i=0; i<arr.length;i++)
            temp.add(arr[i]);
        
        int n=0;
        while(Math.pow(2,n) != temp.size()){
            if(temp.size() < Math.pow(2,n))
                temp.add(0);
            else
                n++;
        }
        
        int[] answer = new int[temp.size()];
        for(int i=0; i<temp.size();i++)
            answer[i] = temp.get(i);
    
        return answer;
    }
}