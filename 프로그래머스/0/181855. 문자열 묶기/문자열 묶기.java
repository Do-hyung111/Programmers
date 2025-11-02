import java.util.Vector;

class Solution {
    public int solution(String[] strArr) {
        Vector<Integer> chk = new Vector<>();
        
        //글자 수의 종류 세기
        for(int i=0; i<strArr.length;i++){        
            if(!chk.contains(strArr[i].length()))
                chk.add(strArr[i].length());
        }
        
        //종류에 맞는 arr 생성
        int[][] chk_arr = new int[chk.size()][2];
        for(int i=0; i<chk.size();i++){
            chk_arr[i][0] = chk.get(i);
        }
        
        //개수 측정
        for(int i=0; i<strArr.length;i++){
            for(int j=0; j<chk_arr.length;j++)
                if(chk_arr[j][0] == strArr[i].length())
                    chk_arr[j][1]++;
        }
        
        //가장 큰 값 찾기
        int answer = 0;
        for(int i=0;i<chk_arr.length;i++){
            if(answer < chk_arr[i][1])
                answer = chk_arr[i][1];
        }
        
        return answer;
    }
}