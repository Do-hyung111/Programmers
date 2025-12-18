class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] temp = s.toCharArray();
        for(int i=0; i<temp.length;i++){
            if(temp[i] == ' ')
                continue;
            boolean isBig = (temp[i]<'a')?true:false;
            temp[i] += n;
            if(isBig)
                while(temp[i]>'Z')
                    temp[i]-=26;
            else
                while(temp[i]>'z')
                    temp[i]-=26;
        }
        return String.valueOf(temp);
    }
}