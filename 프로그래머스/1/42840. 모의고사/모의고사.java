import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        int n1=0, n2=0, n3=0;
        int[] ok = new int[3];
        for(int i : answers){
            if(i==one[n1++])
                ok[0]++;
            if(i==two[n2++])
                ok[1]++;
            if(i==three[n3++])
                ok[2]++;
            
            if(n1>=one.length)
                n1 = 0;
            if(n2>=two.length)
                n2 = 0;
            if(n3>=three.length)
                n3 = 0;
        }
        
        int max = -1;
        for(int i=0; i<ok.length;i++)
                max = (ok[i]>max) ? ok[i] : max;
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<ok.length;i++)
            if(ok[i]==max)
                arr.add(i+1);
        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size();i++)
            answer[i] = arr.get(i);
        
        return answer;
    }
}