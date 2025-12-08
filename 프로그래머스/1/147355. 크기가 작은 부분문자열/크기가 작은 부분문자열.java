class Solution {
    public int solution(String t, String p) {
        int cnt = 0;
        int size = p.length();
        String temp = "";
        for(int i=0;i+size<=t.length();i++){
            temp = t.substring(i,i+size);
            if(p.compareTo(temp) >= 0)
                cnt++;
        }
        
        return cnt;
    }
}

