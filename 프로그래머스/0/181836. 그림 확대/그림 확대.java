import java.util.Vector;

class Solution {
    public String[] solution(String[] picture, int k) {
        Vector<String> temp = new Vector<String>();
        for(int i=0; i<picture.length;i++){
            String dump = "";
            for(int j=0; j<picture[i].length();j++){
                for(int l=0; l<k; l++)
                    dump += picture[i].charAt(j);
            }
            for(int l=0; l<k; l++)
                temp.add(dump);
        }
        
        String[] answer = new String[temp.size()];
        for(int i=0; i<temp.size();i++)
            answer[i] = temp.get(i);
        
        return answer;
    }
}