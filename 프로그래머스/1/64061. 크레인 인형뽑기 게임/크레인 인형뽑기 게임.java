import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        int[] height = new int[board.length];
        for(int i=0;i<height.length;i++)
            height[i]=-1;
        //height 정하기
        for(int i=0; i<board.length;i++){
            for(int j=0; j<height.length;j++){
                if(height[j]==-1 && board[i][j]!=0){
                    height[j]=i;
                }
            }
        }
        
        //값 stack에 넣어주기 (height는 넣을 때 마다 빼기)
        for(int i=0; i<moves.length;i++){
            int move = moves[i]-1;
            if(height[move] == -1)
                continue;
            
            int in = board[height[move]++][move];
            
            if(height[move] >= board.length)
                height[move] = -1;
            
            //터트린 인형 숫자 세기
            if(stk.empty()){
                stk.push(in);
                continue;
            }
            int prior = stk.peek();
            if(prior == in){
                stk.pop();
                answer += 2;
            }
            else
                stk.push(in);
        }
        return answer;
    }
}