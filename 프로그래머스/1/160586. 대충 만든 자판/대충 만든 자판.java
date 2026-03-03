class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for(int i=0; i<targets.length;i++){
            int cnt = 0;
            char[] target = targets[i].toCharArray();
            for(int j=0; j<target.length;j++){
                int min = 101;
                for(int k=0;k<keymap.length;k++){
                    int idx = keymap[k].indexOf(target[j]);
                    min = (idx<min && idx != -1)? idx : min;
                }
                if(min>=101){
                    cnt = 0;
                    break;
                }
                cnt += min+1;
            }            
            answer[i] = (cnt!=0)?cnt:-1;
        }
        return answer;
    }
}