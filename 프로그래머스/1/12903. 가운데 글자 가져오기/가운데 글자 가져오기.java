class Solution {
    public String solution(String s) {
        int size =s.length();
        
        int side = (size%2==0) ? size/2 -1 : size/2;
        
        return s.substring(side, size-side);
    }
}