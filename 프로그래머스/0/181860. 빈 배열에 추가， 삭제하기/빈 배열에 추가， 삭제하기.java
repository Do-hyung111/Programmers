import java.util.Vector;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Vector<Integer> temp = new Vector<Integer>();
        
        for(int i=0; i<arr.length;i++){
            if(flag[i] == true)
                for(int j=0; j<arr[i]*2; j++)
                    temp.add(arr[i]);
            else
                for(int j=0; j<arr[i]; j++)
                    temp.remove(temp.size()-1);
        }
        
        Integer[] temp_int = temp.toArray(new Integer[0]);
        int[] answer = new int[temp_int.length];
        for(int i=0; i<temp_int.length;i++)
            answer[i] = temp_int[i];
        return answer;
    }
}