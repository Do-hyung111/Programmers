class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int lBig = 0;
        int rBig = 0;
        
        for(int i=0; i<sizes.length;i++){
            if(sizes[i][0] > sizes[i][1]){
                if(lBig <= sizes[i][0])
                    lBig = sizes[i][0];
                if(rBig <= sizes[i][1])
                    rBig = sizes[i][1];
            }
            else{
                if(lBig <= sizes[i][1])
                    lBig = sizes[i][1];
                if(rBig <= sizes[i][0])
                    rBig = sizes[i][0];
            }
        }
        return lBig*rBig;
    }
}