import java.util.Arrays;
import java.util.Vector;

class Solution {
    public String[] solution(String[] strings, int n) {
        StringBuilder[] sb = new StringBuilder[strings.length];
        for(int i=0; i<strings.length;i++)
            strings[i] = strings[i].charAt(n) + strings[i];
        
        Arrays.sort(strings);
        
        for(int i=0; i<strings.length;i++)
            strings[i] = strings[i].substring(1,strings[i].length());
        
        return strings;
    }
}