import java.util.Arrays;
import java.util.Vector;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] top3 = new int[3];
        int idx = 0;
        int nrank = 1;
        while(idx < 3){
            for(int i=0; i<rank.length;i++)
                if(rank[i] == nrank)
                    if(attendance[i])
                        top3[idx++] = i;
            nrank++;
        }
        return top3[0]*10000 + top3[1]*100 + top3[2];
    }
}