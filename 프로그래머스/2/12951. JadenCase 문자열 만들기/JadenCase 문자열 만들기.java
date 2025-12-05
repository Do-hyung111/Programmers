import java.lang.StringBuilder;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        
        
        for(char temp : s.toCharArray()){
            if(temp == ' '){
                sb.append(temp);
                first = true;
            }
            else{
                if(first)
                    sb.append(Character.toUpperCase(temp));
                else
                    sb.append(Character.toLowerCase(temp));
                first = false;
            }
        }
        
        return sb.toString();
    }
}