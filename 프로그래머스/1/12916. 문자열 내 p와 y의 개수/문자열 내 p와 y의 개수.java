class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int Pcnt = 0;
        int Ycnt = 0;
        
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'P' || c == 'p')
                Pcnt++;
            else if(c == 'Y' || c == 'y')
                Ycnt++;
        }

        return (Pcnt == Ycnt) ? true : false;
    }
}