class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int Lpoint = 10;
        int Rpoint = 12;
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == 1||numbers[i] == 4||numbers[i] == 7){
                answer.append("L");
                Lpoint = numbers[i];
            }
            else if(numbers[i] == 3||numbers[i] == 6||numbers[i] == 9){
                answer.append("R");
                Rpoint = numbers[i];
            }
            else{
                int Ldst = distance(Lpoint, numbers[i]);
                int Rdst = distance(Rpoint, numbers[i]);
                
                if(Ldst < Rdst){
                    Lpoint = numbers[i];
                    answer.append("L");
                }
                else if(Rdst < Ldst){
                    Rpoint = numbers[i];
                    answer.append("R");
                }
                else{
                    if(hand.equals("left")){
                        answer.append("L");
                        Lpoint = numbers[i];
                    }
                    else{
                        answer.append("R");
                        Rpoint = numbers[i];
                    }
                }
            }
        }
        
        return answer.toString();
    }
    
    public int distance(int num, int target){
        if(num == 0)
            num = 11;
        if(target == 0)
            target = 11;
        int drow = Math.abs((target-1)/3 - (num-1)/3);
        int dcol = Math.abs((target-1)%3 - (num-1)%3);
        return drow + dcol;
    }
}