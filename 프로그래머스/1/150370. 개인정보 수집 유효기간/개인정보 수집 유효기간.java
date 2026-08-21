import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> result = new ArrayList<>();
        
        Map<Character,Integer> term = new HashMap<>();
        for(int i=0;i<terms.length;i++)
            term.put(terms[i].charAt(0),Integer.valueOf(terms[i].substring(2)));

        int year = Integer.valueOf(today.substring(0,4));
        int month = Integer.valueOf(today.substring(5,7));
        int date = Integer.valueOf(today.substring(8,10));
        int now = year*12*28+month*28+date;

        for(int i=0;i<privacies.length;i++){
            year = Integer.valueOf(privacies[i].substring(0,4));
            month = Integer.valueOf(privacies[i].substring(5,7));
            date = Integer.valueOf(privacies[i].substring(8,10)); 
            int time = year*12*28+month*28+date + 28*term.get(privacies[i].charAt(11));
            if(time <= now)
                result.add(i+1);
        }
        
        int[] answer = new int[result.size()];
        for(int i=0;i<result.size();i++)
            answer[i] = result.get(i);
        return answer;
    }
}