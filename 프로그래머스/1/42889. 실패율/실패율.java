import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] play = new int[N];
        int[] stop = new int[N];
        for(int i=0; i<stages.length;i++){
            for(int j=0; j<play.length;j++){
                if(j+1 <= stages[i])
                    play[j]++;
                if(j+1 == stages[i])
                    stop[j]++;
            }
        }
        double[] temp = new double[N];
        for(int i=0;i<play.length;i++){
            if(play[i]==0){
                temp[i] = 0;
                continue;
            }
            else
                temp[i] = (double)stop[i]/play[i];
        }

        //실패율은 temp에 들어 있으므로, 이를 잘 정렬해서 출력만 하면 된다.
        double[][] arr = new double[N][2];
        for(int i=0; i<temp.length;i++){
            arr[i][0] = temp[i];
            arr[i][1] = i+1;
        }
        Arrays.sort(arr, (a,b)-> {
           if(b[0] == a[0])
               return (int)(a[1]-b[1]);
            return Double.compare(b[0],a[0]);
        });
        int[] answer = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            answer[i] = (int)arr[i][1];
        }
        
        return answer;
    }
}