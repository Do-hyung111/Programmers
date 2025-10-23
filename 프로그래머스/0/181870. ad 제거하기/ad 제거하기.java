import java.util.Vector;

class Solution {
    public String[] solution(String[] strArr) {
        Vector<String> v = new Vector<String>();
        
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad") == false)
                v.add(strArr[i]);
        }
        String[] answer = new String[v.size()];
        answer = (String[])v.toArray(answer);
        
        return answer;
    }
}