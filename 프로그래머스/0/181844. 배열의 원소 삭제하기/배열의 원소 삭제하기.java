import java.util.Vector;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Vector<Integer> temp = new Vector<Integer>();
        
        for(int i=0; i<arr.length;i++){
            boolean include = false;
            for(int j=0; j<delete_list.length; j++){ 
                if(delete_list[j] == arr[i])
                    include = true;
            }
            if(!include)
                temp.add(arr[i]);
        }
        
        int[] answer = new int[temp.size()];
        for(int i =0; i<answer.length;i++)
            answer[i] = temp.get(i);
        
        return answer;
    }
}