class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] three = base3Re(n).toCharArray();
        int cnt = three.length-1;
        
        for(int i=0; i<three.length ;i++)
            answer += (three[i]-48) * Math.pow(3,cnt--); 
        
        return answer;
    }
    
    public String base3Re(int n){
        int num = n;
        String str = "";
        while(num != 0){
            str += num%3;
            num /= 3;
        }
        return str;
    }
    
    
}