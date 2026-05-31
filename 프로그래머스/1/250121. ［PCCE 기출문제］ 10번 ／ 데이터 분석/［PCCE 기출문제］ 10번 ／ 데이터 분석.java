import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<Integer> check = new ArrayList<>();
        
        int Eidx = make_idx(ext);
        int Sidx = make_idx(sort_by);
        
        for(int i=0; i<data.length;i++){
            if(data[i][Eidx] < val_ext)
                check.add(i);
        }
        
        int[][] answer = new int[check.size()][4];
        
        for(int i=0; i<answer.length;i++){
            answer[i] = data[check.get(i)];
        }
        
        Arrays.sort(answer,Comparator.comparingInt(o -> o[Sidx]));
        
        return answer;
    }
    
    public int make_idx(String S){
        if(S.equals("code"))
            return 0;
        else if(S.equals("date"))
            return 1;
        else if(S.equals("maximum"))
            return 2;
        else if(S.equals("remain"))
            return 3;
        else //잘못된 경우
            return -1;
    }
}