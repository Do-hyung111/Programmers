import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2,s.length()-2);
        String[] s_set = s.split("\\},\\{");
        Arrays.sort(s_set, Comparator.comparingInt(String::length));
        
        Set<Integer> n_set = new LinkedHashSet<>();        
        for(int i=0; i<s_set.length;i++){
            String[] num = s_set[i].split(",");

            for(int j=0; j<num.length;j++)
                n_set.add(Integer.parseInt(num[j]));
        }
        
        
        int[] answer = new int[n_set.size()];
        int idx =0;
        for(int i : n_set)
            answer[idx++] = i;
        
        return answer;
    }
}