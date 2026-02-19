class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] str = s.toCharArray();
        
        for(int i=0; i<str.length;i++){
            int c = str[i];
            int move = 0;
            while(move < index){
                c++;
                if(c>122)
                    c-=26;
                if(skip.indexOf(c)==-1)
                    move++;
            }
            answer+=(char)c;
        }
        
        return answer;
    }
}