class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {50,50,0,0};
        //0 = mini, 1 = minj, 2 = maxi, 3 = maxj
        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[0].length();j++){
                if(wallpaper[i].charAt(j)=='#'){
                    if(answer[0]>i)
                        answer[0] = i;
                    if(answer[1]>j)
                        answer[1] = j;
                    if(answer[2]<i+1)
                        answer[2] = i+1;
                    if(answer[3]<j+1)
                        answer[3] = j+1;
                }
            }
        }
        return answer;
    }
}