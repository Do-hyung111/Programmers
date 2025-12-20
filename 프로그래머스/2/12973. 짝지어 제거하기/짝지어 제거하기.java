import java.util.Stack;
class Solution
{
    public int solution(String s){
        Stack<Character> stk = new Stack<Character>();
        
        for(char i : s.toCharArray()){
            if(!stk.isEmpty() && stk.peek() == i)
                stk.pop();
            else 
                stk.push(i);
        }
        return (stk.isEmpty()) ? 1 : 0;
    }
}