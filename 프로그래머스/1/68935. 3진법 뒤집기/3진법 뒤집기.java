class Solution {
    public int solution(int n) {
        String three = base3Re(n);
        
        return Integer.parseInt(three, 3);
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