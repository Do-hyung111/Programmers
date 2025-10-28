import java.util.Vector;

class Solution {
    public String[] solution(String myStr) {
        String[] temp = myStr.split("[abc]+");
        
        Vector<String> answer = new Vector<String>();
        for(int i=0; i<temp.length; i++){
            if(!temp[i].equals("")){
                answer.add(temp[i]);
            }
        }
        if(answer.isEmpty())
            answer.add("EMPTY");
        
        return answer.toArray(new String[0]);
    }
}