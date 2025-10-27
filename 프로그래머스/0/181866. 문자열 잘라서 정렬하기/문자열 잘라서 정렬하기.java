import java.util.Arrays;
import java.util.Vector;
class Solution {
    public String[] solution(String myString) {
        String[] temp = myString.replaceAll("\\s", "").split("x+"); 
        Arrays.sort(temp);
        
        Vector<String> answer = new Vector<String>();
        for(int i=0; i<temp.length; i++)
            if(!temp[i].equals(""))
                answer.add(temp[i]);
        
        return answer.toArray(new String[0]);
    }
}