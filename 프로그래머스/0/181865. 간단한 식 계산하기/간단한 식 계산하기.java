class Solution {
    public int solution(String binomial) {
        String[] temp = binomial.split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[2]);
        String op = temp[1];
        
        if(op.equals("+"))
            return a+b; 
        else if(op.equals("-"))
            return a-b;
        else
            return a*b;
    }
}