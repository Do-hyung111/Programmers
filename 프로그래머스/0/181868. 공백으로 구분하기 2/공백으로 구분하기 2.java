import java.util.Vector;

class Solution {
    public String[] solution(String my_string) {
        Vector<String> answer = new Vector<String>();
        String[] temp = my_string.split(" ");
        
        for(int i=0; i<temp.length;i++)
            if(temp[i].length() >= 1){
                answer.add(temp[i]);
            }
        
        return answer.toArray(new String[0]);
    }
}