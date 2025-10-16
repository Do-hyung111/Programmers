import java.util.Vector;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        Vector<String> temp = new Vector<String>();
        
        for(int i=0; i<finished.length;i++)
            if(finished[i] == false)
                temp.add(todo_list[i]);
        
        String[] answer = temp.toArray(new String[0]);
        
        return answer;
    }
}